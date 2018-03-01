//package org.fc.hd.hiwallet.login;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//
//import org.apache.commons.lang3.StringUtils;
//import org.fc.hzq.ordbgens.sys.entity.GASSysMenu;
//import org.fc.hzq.ordbgens.sys.entity.GASSysMenuExample;
//import org.fc.hzq.ordbgens.sys.entity.GASSysRoleMenu;
//import org.fc.hzq.ordbgens.sys.entity.GASSysRoleMenuExample;
//import org.fc.hzq.ordbgens.sys.entity.GASSysUser;
//import org.fc.hzq.ordbgens.sys.entity.GASSysUserExample;
//import org.fc.hzq.ordbgens.sys.entity.GASSysUserRole;
//import org.fc.hzq.ordbgens.sys.entity.GASSysUserRoleExample;
//import org.fc.hzq.service.login.Login.MenuInfo;
//import org.fc.hzq.service.login.Login.PLOGINCommand;
//import org.fc.hzq.service.login.Login.PLOGINModule;
//import org.fc.hzq.service.login.Login.PRetLogin;
//import org.fc.hzq.service.login.Login.PSLogin;
//import org.fc.hzq.service.login.Login.UserInfo;
//import org.fc.hzq.sys.dao.Daos;
//import org.fc.hzq.sys.persist.entity.RoleMenu;
//
//import lombok.Data;
//import lombok.extern.slf4j.Slf4j;
//import onight.oapi.scala.commons.SessionModules;
//import onight.osgi.annotation.NActorProvider;
//import onight.tfw.async.CompleteHandler;
//import onight.tfw.ntrans.api.annotation.ActorRequire;
//import onight.tfw.ojpa.api.OJpaDAO;
//import onight.tfw.ojpa.api.annotations.StoreDAO;
//import onight.tfw.otransio.api.PacketHelper;
//import onight.tfw.otransio.api.beans.FramePacket;
//import onight.tfw.outils.bean.BeanPBUtil;
//
//@NActorProvider
//@Slf4j
//@Data
//public class PLoginServer extends SessionModules<PSLogin> {
//	@ActorRequire
//	LoginHelper loginHelper;
//
//	@ActorRequire
//	Daos sysDaos;
//
//	@Override
//	public String[] getCmds() {
//		return new String[] { PLOGINCommand.LIN.name() };
//	}
//
//	@Override
//	public String getModule() {
//		return PLOGINModule.LIO.name();
//	}
//
//	BeanPBUtil pbutil = new BeanPBUtil();
//
//	public void appendParentMenu(HashMap<String, RoleMenu> rolemenuById, HashMap<String, GASSysMenu> gasMenuByMenuID,
//			RoleMenu checkrolemenu, List<RoleMenu> dstRoleMenu) {
//		if (StringUtils.equals("#", checkrolemenu.getParentMenuId())
//				|| StringUtils.isBlank(checkrolemenu.getParentMenuId())
//				|| rolemenuById.containsKey(checkrolemenu.getParentMenuId())) {
//			return;
//		}
//
//		GASSysMenu gasSysMenu = (GASSysMenu) gasMenuByMenuID.get(checkrolemenu.getParentMenuId());
//		if(gasSysMenu==null){
//			return;
//		}
//		RoleMenu roleMenu = new RoleMenu();
//		roleMenu.setIcon(gasSysMenu.getIcon());
//		roleMenu.setLeafFlag(gasSysMenu.getLeafFlag().toString());
//		roleMenu.setMenuDesc(gasSysMenu.getMenuDesc());
//		roleMenu.setMenuId(gasSysMenu.getMenuId());
//		roleMenu.setMenuLevel(gasSysMenu.getLeafFlag().toString());
//		roleMenu.setMenuName(gasSysMenu.getMenuName());
//		roleMenu.setMenuSeq(gasSysMenu.getMenuSeq().intValue());
//		roleMenu.setMenuUrl(gasSysMenu.getMenuUrl());
//		roleMenu.setParentMenuId(gasSysMenu.getParentMenuId());
//		//dstRoleMenu.add(roleMenu);
//		rolemenuById.put(gasSysMenu.getMenuId(), roleMenu);
//		appendParentMenu(rolemenuById, gasMenuByMenuID, roleMenu, dstRoleMenu);
//	}
//
//	@Override
//	public void onPBPacket(final FramePacket pack, final PSLogin pb, final CompleteHandler handler) {
//		log.info("login uerName:" + pb.getUserName());
//		PRetLogin.Builder ret = PRetLogin.newBuilder();
//
//		try {
//			loginProcess(pack, pb, ret);
//			ret.setErrCode("1").setMsg("登录成功");
//		} catch (IllegalArgumentException e) {
//			ret.setErrCode("2").setMsg("" + e.getMessage());
//		} catch (Exception e) {
//			ret.setErrCode("3").setMsg("" + e.getMessage());
//			e.printStackTrace();
//		}
//		pack.getExtHead().buildFor(pack.getHttpServerletResponse());
//		// 返回给客户端
//		handler.onFinished(PacketHelper.toPBReturn(pack, ret.build()));
//	}
//
//	public void loginProcess(FramePacket pack, PSLogin pb, PRetLogin.Builder ret) {
//		String strMsg = "用户名或密码错误"; // 默认错误提示信息
//		String errCode = "-9997"; // 默认用户名密码错误对应编码
//		// 查询用户信息
//		GASSysUserExample gasSysUserExample = new GASSysUserExample();
//		GASSysUserExample.Criteria gasSysUserCriteria = gasSysUserExample.createCriteria();
//		gasSysUserCriteria.andLoginNameEqualTo(pb.getUserName());
//		List<Object> gasSysUserList = sysDaos.gasSysUserDao.selectByExample(gasSysUserExample);
//		// 用户不存在
//		if (gasSysUserList == null || gasSysUserList.size() < 1) {
//			throw new IllegalArgumentException(strMsg);
//		}
//		// 密码错误
//		GASSysUser gasSysUser = (GASSysUser) gasSysUserList.get(0);
//		if (!gasSysUser.getPassword().equals(pb.getPassword())) {
//			throw new IllegalArgumentException(strMsg);
//		}
//
//		// 查找用户角色
//		GASSysUserRoleExample roleEx = new GASSysUserRoleExample();
//		roleEx.createCriteria().andUserIdEqualTo(gasSysUser.getUserId());
//		List<Object> roles = sysDaos.gasSysUserRoleDao.selectByExample(roleEx);
//		if (roles == null || roles.size() < 1) {
//			throw new IllegalArgumentException("用户无权限使用该系统！");
//		}
//		// 用户RoleId列表
//		List<String> lsUserRole = new ArrayList<String>();
//		for (Object userRole : roles) {
//			GASSysUserRole tmpUserRole = (GASSysUserRole) userRole;
//			lsUserRole.add(tmpUserRole.getRoleId());
//		}
//		log.info("userRoles:" + lsUserRole);
//
//		/*
//		 * // 查询所有角色对应的菜单 -----多表关联查询------ RoleMenuPara roleMenuPara = new
//		 * RoleMenuPara(); roleMenuPara.setLsRoles(lsUserRole); List<Object>
//		 * lsRoleMenu = roleMenuDao.selectByExample(roleMenuPara);
//		 * log.info("lsRoleMenu:" + lsRoleMenu);
//		 */
//
//		// 查询roleid_menuid 角色和菜单关系表
//		GASSysRoleMenuExample gasSysRoleMenuExample = new GASSysRoleMenuExample();
//		GASSysRoleMenuExample.Criteria gasSysRoleMenuCriteria = gasSysRoleMenuExample.createCriteria();
//		gasSysRoleMenuCriteria.andRoleIdIn(lsUserRole);
//		List<Object> lsRoleMenuId = sysDaos.gasSysRoleMenuDao.selectByExample(gasSysRoleMenuExample);
//		if (lsRoleMenuId==null||lsRoleMenuId.size() < 1) {
//			throw new IllegalArgumentException("用户无菜单列表！");
//		}
//
//		// 组装menuId
//		List<String> lsMenuId = new ArrayList<String>();
//		if (lsRoleMenuId != null && lsRoleMenuId.size() > 0) {
//			for (Object obj : lsRoleMenuId) {
//				GASSysRoleMenu roleMenuId = (GASSysRoleMenu) obj;
//				lsMenuId.add(roleMenuId.getMenuId());
//			}
//		}
//
//		// 查询菜单实体类
//		GASSysMenuExample gasSysMenuExample = new GASSysMenuExample();
//		GASSysMenuExample.Criteria gasSysMenuCriteria = gasSysMenuExample.createCriteria();
//		gasSysMenuCriteria.andMenuIdIn(lsMenuId);
//		gasSysMenuExample.setOrderByClause(" PARENT_MENU_ID, MENU_ID");
//		List<Object> lsGASSysMenu = sysDaos.gasSysMenuDao.selectByExample(gasSysMenuExample);
//		// 组装菜单实体
//		List<RoleMenu> lsRoleMenu = new ArrayList<RoleMenu>();
//		HashMap<String, GASSysMenu> gasMenuByMenuID = new HashMap<>();
//
//		for (Object o : sysDaos.gasSysMenuDao.findAll(new ArrayList<Object>())) {
//			GASSysMenu gasSysMenu = (GASSysMenu) o;
//			gasMenuByMenuID.put(gasSysMenu.getMenuId(), gasSysMenu);
//		}
//		HashMap<String, RoleMenu> userMenuByMenuID = new HashMap<>();
//		if (lsGASSysMenu != null && lsGASSysMenu.size() > 0) {
//			for (Object obj : lsGASSysMenu) {
//				GASSysMenu gasSysMenu = (GASSysMenu) obj;
//				RoleMenu roleMenu = new RoleMenu();
//				roleMenu.setIcon(gasSysMenu.getIcon());
//				roleMenu.setLeafFlag(gasSysMenu.getLeafFlag().toString());
//				roleMenu.setMenuDesc(gasSysMenu.getMenuDesc());
//				roleMenu.setMenuId(gasSysMenu.getMenuId());
//				roleMenu.setMenuLevel(gasSysMenu.getLeafFlag().toString());
//				roleMenu.setMenuName(gasSysMenu.getMenuName());
//				roleMenu.setMenuSeq(gasSysMenu.getMenuSeq().intValue());
//				roleMenu.setMenuUrl(gasSysMenu.getMenuUrl());
//				roleMenu.setParentMenuId(gasSysMenu.getParentMenuId());
//				lsRoleMenu.add(roleMenu);
//				userMenuByMenuID.put(gasSysMenu.getMenuId(), roleMenu);
//			}
//
//			// add by brew
//			for (RoleMenu menu1 : lsRoleMenu) {
//				appendParentMenu(userMenuByMenuID, gasMenuByMenuID, menu1, lsRoleMenu);
//			}
//		}
//
//		// 组装返回ProtoBuf结果
//		if (lsRoleMenu != null && lsRoleMenu.size() > 0) {
//			RoleMenu[] menus = userMenuByMenuID.values().toArray(new RoleMenu[]{});
//			Arrays.sort(menus,new Comparator<RoleMenu>() {
//				@Override
//				public int compare(RoleMenu o1, RoleMenu o2) {
//					return o1.getMenuSeq().compareTo(o2.getMenuSeq());
//				}
//			});
//			
//			List<RoleMenu> lsMenu = loginHelper.assembleMenuList(menus);
//			for (RoleMenu rm : lsMenu) {
//				MenuInfo md = pbutil.toPB(MenuInfo.newBuilder(), rm);
//				ret.addMenuInfo(md);
//			}
//		}
//
//		// 组装用户信息;
//		UserInfo userInfo = UserInfo.newBuilder().setUserId(gasSysUser.getUserId())
//				.setEmployeeName(gasSysUser.getEmployeeName() != null ? gasSysUser.getEmployeeName() : "")
//				.setEmployeeCode(gasSysUser.getEmployeeCode() != null ? gasSysUser.getEmployeeCode() : "")
//				.setTel(gasSysUser.getTel() != null ? gasSysUser.getTel() : "")
//				.setMobile(gasSysUser.getMobile() != null ? gasSysUser.getMobile() : "")
//				.setEmail(gasSysUser.getEmail() != null ? gasSysUser.getEmail() : "")
//				.setAddress(gasSysUser.getAddress() != null ? gasSysUser.getAddress() : "")
//				.setUnitId(gasSysUser.getUnitId() != null ? gasSysUser.getUnitId() : "")
//				.setChargeUnitId(gasSysUser.getChargeUnitId() != null ? gasSysUser.getChargeUnitId() : "")
//				.setStationId(gasSysUser.getStationId() != null ? gasSysUser.getStationId() : "")
//				.setAreaId(gasSysUser.getAreaId() != null ? gasSysUser.getAreaId() : "")
//				.setRemark(gasSysUser.getRemark() != null ? gasSysUser.getRemark() : "")
//				.setLoginName(gasSysUser.getLoginName() != null ? gasSysUser.getLoginName() : "").build();
//		ret.setUserInfo(userInfo);
//		ret.setServerTime(""+System.currentTimeMillis());
//
//		// 登录成功之后，设置用户session
//		loginHelper.loginSetting(pack, gasSysUser, lsUserRole);
//	}
//
//}

package org.fc.bc.wlt.util;

public class ExceptionUtil extends Exception {

	public static Exception InsertDatabaseException(){
		throw new IllegalArgumentException("插入数据库异常");
	}
	
	public static Exception UpdateDatabaseException(){
		throw new IllegalArgumentException("更新数据库异常");
	}
	
	public static Exception UpdateOrInsertException(){
		throw new IllegalArgumentException("插入或更新数据库异常");
	}
	
	public static Exception UserRegistedException(){
		throw new IllegalArgumentException("用户已注册");
	}
}

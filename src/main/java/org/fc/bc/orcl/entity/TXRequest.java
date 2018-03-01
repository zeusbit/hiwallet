package org.fc.bc.orcl.entity;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class TXRequest extends HttpServletRequestWrapper {

	Map<String, String> params;
	String pathInfo;

	public TXRequest(Object request, Map<String, String> params, String pathInfo) {
		super((HttpServletRequest)request);
		this.params = params;
		this.pathInfo = pathInfo;
	}

	@Override
	public String getPathInfo() {
		return pathInfo;
	}

	@Override
	public String getParameter(String name) {
		if (params!=null&&params.containsKey(name))
			return params.get(name);
		return super.getParameter(name);
	}

}

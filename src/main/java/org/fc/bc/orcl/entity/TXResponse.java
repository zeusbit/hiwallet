package org.fc.bc.orcl.entity;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class TXResponse extends HttpServletResponseWrapper {

	public TXResponse(Object response) {
		super((HttpServletResponse)response);
	}

}

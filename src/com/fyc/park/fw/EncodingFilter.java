package com.fyc.park.fw;

import java.io.IOException;
import javax.servlet.*;

public class EncodingFilter implements Filter {

	public void init(FilterConfig filterconfig) throws ServletException {
	}

	public void doFilter(ServletRequest servletrequest,
			ServletResponse servletresponse, FilterChain filterchain)
			throws IOException, ServletException {
		servletrequest.setCharacterEncoding("UTF-8");
		filterchain.doFilter(servletrequest, servletresponse);
	}

	@Override
	public void destroy() {
	}
}

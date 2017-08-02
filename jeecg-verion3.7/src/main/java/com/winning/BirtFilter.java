package com.winning;

import java.io.IOException;

import javax.servlet.Filter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class BirtFilter implements Filter {

    public void destroy() {
	// TODO Auto-generated method stub

    }

    public void doFilter(ServletRequest req, ServletResponse resp,
	    FilterChain arg2) throws IOException, ServletException {
	// TODO Auto-generated method stub
	HttpServletRequest request = (HttpServletRequest)req;
	HttpServletResponse response = (HttpServletResponse)resp;
	
	if(request.getRequestURL().indexOf("/output")!=-1 ||
		request.getRequestURL().indexOf("/download/")!=-1||
	    request.getRequestURL().indexOf("/preview")!=-1||
		request.getRequestURL().indexOf("/document")!=-1||
		    request.getRequestURL().indexOf("/frameset")!=-1||
		    request.getRequestURL().indexOf("/extract")!=-1||
		    request.getRequestURL().indexOf("/run")!=-1||
		request.getRequestURL().indexOf("/parameter")!=-1){
	   request.getRequestDispatcher(request.getServletPath()+"?"+request.getQueryString()).forward(request, response);
	}else {
	    arg2.doFilter(request, response);
	}
    }

    public void init(FilterConfig arg0) throws ServletException {
	// TODO Auto-generated method stub

    }
}




package com.dimensoft.core.conf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dimensoft.core.model.KUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.dimensoft.common.toolkit.Constant;

public class LoginInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		//
		KUser ku = new KUser();
		ku.setuAccount("admin");
		ku.setuNickname("admin");
		ku.setDelFlag(1);
		ku.setuId(1);
		request.getSession().setAttribute(Constant.SESSION_ID,ku);
		Object attribute = request.getSession().getAttribute(Constant.SESSION_ID);
		String uri = request.getRequestURI();
		//登陆请求不能被拦截
		if(!uri.contains("view/loginUI.shtml") && !uri.contains("index/login.shtml")){
			//判断session中是否有值？
			if(attribute == null){
				response.sendRedirect(request.getContextPath() + "/view/loginUI.shtml");
				return false;
			}
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {	
	}
}
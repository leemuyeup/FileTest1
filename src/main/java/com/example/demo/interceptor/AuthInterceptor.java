package com.example.demo.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AuthInterceptor implements HandlerInterceptor{

	public boolean preHandle(jakarta.servlet.http.HttpServletRequest request,jakarta.servlet.http.HttpServletResponse response,Object handler) throws Exception{
		log.info("========================== AuthInterceptor ==================================");
		log.info(request.getRequestURI());
		jakarta.servlet.http.HttpSession session = request.getSession();
		String userId = (String)session.getAttribute("id");
		log.info("userId:"+(userId == null));
		if(userId == null) {
			response.sendRedirect("/login/form");
			return false;
		}else 
			return true;
		
	}

}
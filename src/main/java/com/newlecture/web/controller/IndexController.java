package com.newlecture.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class IndexController implements Controller{

	
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("이게 나와야해...");
		System.out.println("master branch test");
		System.out.println("branch Test");
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "hello Spring MVC~");
		mv.setViewName("/WEB-INF/view/index.jsp");
		
		return mv;
	}
	
}

package com.newlecture.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping("index")
	@ResponseBody
	public String index() {
		
		return "Hello Index 1";
	}
	
	
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		ModelAndView mv = new ModelAndView("root.index");
//		mv.addObject("data", "hello Spring MVC~");
//		// mv.setViewName("/WEB-INF/view/index.jsp");
//
//		return mv;
//	}
	
}

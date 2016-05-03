package com.action.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Student {
	@RequestMapping("/student")
	public ModelAndView helloworld(){
		ModelAndView mv = new ModelAndView("student","message","Congrats..!! You are Selected...");
		return mv;
	}
}

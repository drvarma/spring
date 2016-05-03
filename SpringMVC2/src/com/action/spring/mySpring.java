package com.action.spring;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.action.dao.DBConnection;

@Controller
public class mySpring {
	@RequestMapping("/welcome")
	public ModelAndView hellowrold(){
		DBConnection dbcon = new DBConnection();
		ArrayList al = new ArrayList();
		al = dbcon.getLocation();
		System.out.println("Hello....");
//		String message = "<br><div style='text-align:center;'>"
//				+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is coming from SpringMVCHelloWorld.java **********</div><br><br>";
		return new ModelAndView("welcome", "raghu", al);
		//return new Mo
	}
	
}

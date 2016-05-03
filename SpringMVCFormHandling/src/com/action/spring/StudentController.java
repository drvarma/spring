package com.action.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.action.model.Student;


@Controller
public class StudentController {
	@RequestMapping(value="/StudentForm", method = RequestMethod.GET)
	public ModelAndView studentFrom(){
		ModelAndView model = new ModelAndView("studentForm");
		return model;
	}
	
	@RequestMapping(value="/StudentDetails", method = RequestMethod.POST)
	public ModelAndView hello(@ModelAttribute("student") Student stu){
		ModelAndView model = new ModelAndView("studentDetails");
		model.addObject("student", stu);
		return model;
	}

}

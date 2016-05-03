package com.action.Spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentControler {

	@RequestMapping(value="/Submit", method=RequestMethod.POST)
	public ModelAndView submitForm(@ModelAttribute("student1") Student student1){
		ModelAndView model = new ModelAndView("studentDetails");
		model.addObject("student1", student1);
		return model;
	}
}

package com.form.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getResponse(){
		ModelAndView model = new ModelAndView("index");
		return model;
	}

	@RequestMapping(value="/FormValidationspring/Submit", method=RequestMethod.POST)
	public ModelAndView form(@Valid @ModelAttribute("student") Student student, BindingResult result){
		ModelAndView model;
		if(result.hasErrors()){
			model = new ModelAndView("index");
			return model;
		
		}
		model = new ModelAndView("display");
		return model;
	}
}

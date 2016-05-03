package com.form.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	@RequestMapping(value="/FormValidationUsingSpring/Submit", method=RequestMethod.POST)
	public ModelAndView formSubmission(@Valid @ModelAttribute("user") User user, BindingResult result){
		if(result.hasErrors()){
			ModelAndView model = new ModelAndView("index");
			return model;
		}
		
		ModelAndView model = new ModelAndView("display");
		model.addObject("user", user);
		return model;
	}

}

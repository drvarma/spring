package com.coderscampus.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderscampus.domain.Course;
import com.coderscampus.domain.Lesson;
import com.coderscampus.repository.CourseRepository;

@Controller
public class IndexController {
	@Autowired
	CourseRepository courseRepo;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String root(ModelMap model){
		Course course = new Course();
		model.put("course", course);
		return "index";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String rootPost(@ModelAttribute Course course, ModelMap model){
		 
		courseRepo.save(course);
		return "redirect:/";
	}
	
	@RequestMapping(value="/{courseId}", method=RequestMethod.GET)
	public String lessons(@PathVariable Long courseId, ModelMap model){
		Course course = courseRepo.findOne(courseId);
		Lesson lesson = new Lesson();
		model.put("course", course);
		model.put("lesson", lesson);
		return "lesson";
	}
	
	@RequestMapping(value="/{courseId}/createLesson")
	public String createLesson(@PathVariable Long courseId, @ModelAttribute Lesson lesson, ModelMap model){
		
		Course course = courseRepo.findOne(courseId);
		lesson.setCourse(course);
		course.getLessons().add(lesson);
		courseRepo.save(course);
		return "redirect:/"+course.getId();
	}

}

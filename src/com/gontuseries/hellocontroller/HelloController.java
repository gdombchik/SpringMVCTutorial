package com.gontuseries.hellocontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hello world");

		return model;
	}
	
	@RequestMapping("/hi/{test}/{test2}") //allows the user to enter any value:  http://localhost:8080/FirstSpringMVCProject_07/greet/hi/1/2
	public ModelAndView hiWorld(@PathVariable Map<String,String> pathVars) {
		
		String test = pathVars.get("test");
		String test2 = pathVars.get("test2");
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","hi world " + test2);

		return model;
	}

}
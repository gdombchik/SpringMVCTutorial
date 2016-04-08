package com.gontuseries.gregcontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GregController {
	
	@RequestMapping("/welcomeFromGreg/{value1}/{value2}")
	public ModelAndView getGregHelloWorld(/*@PathVariable("value1") String value1,@PathVariable("value2") String value2*/
			@PathVariable Map<String,String> pathVars){
		ModelAndView modelAndView = new ModelAndView("GregHelloWorldPage");
		//modelAndView.addObject("gregAttributeName", "This is a message from Greg: " + value1 + value2);
		
		modelAndView.addObject("gregAttributeName", "This is a message from Greg: " + pathVars.get("value1") + pathVars.get("value2"));
		
		return modelAndView;
	}

}

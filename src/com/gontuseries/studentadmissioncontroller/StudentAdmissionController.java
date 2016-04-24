package com.gontuseries.studentadmissioncontroller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	


	@RequestMapping(value="/admissionForm.html", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		
		return modelAndView;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields(new String[]{"mobile"});
		SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyyy");
		binder.registerCustomEditor(Date.class, "dob",new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class,"name",new StudentNameEditor());
	}
	
	@ModelAttribute
	public void getHeader(Model model){
		model.addAttribute("headerMessage", "This is a header message");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method= RequestMethod.POST)
	//public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPar){	
	public ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student1") Student student,BindingResult result){	
	
		//String name = reqPar.get("studentName");
		//String hobby = reqPar.get("studentHobby");
		
		//Student student = new Student();
		//student.setName(name);
		//student.setHobby(hobby);
		
		
		//if a binding result error, return to the submitting form
		if(result.hasErrors()){
			ModelAndView modelAndView = new ModelAndView("AdmissionForm");
			return modelAndView;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("msg","Details submitted by you: Name " + student.getName() + ", Hobby: " + student.getHobby());
		//model.addObject("student",student);
		
		return model;
	}
}

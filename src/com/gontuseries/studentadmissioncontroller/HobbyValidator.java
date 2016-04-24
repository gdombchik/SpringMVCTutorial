package com.gontuseries.studentadmissioncontroller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby,String>{

	String listOfValidHobbies;
	
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		// TODO Auto-generated method stub
		listOfValidHobbies = isValidHobby.listOfValidHobbies();
	}

	@Override
	public boolean isValid(String studentHobby, ConstraintValidatorContext arg1) {
		if(studentHobby == null){
			return false;
		}
		
		if(studentHobby.matches(listOfValidHobbies)){
			return true;
		}else{
			return false;
		}
	}
}

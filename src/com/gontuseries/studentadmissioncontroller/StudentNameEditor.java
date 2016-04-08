package com.gontuseries.studentadmissioncontroller;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport{

	@Override
	public void setAsText(String name) throws IllegalArgumentException {
		if(name.contains("Mr.") || name.contains("Mrs.")){
			setValue(name);
		}else{
			name = "Mrs. " + name;
			setValue(name);
		}
	}
}

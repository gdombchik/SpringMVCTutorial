package com.gontuseries.studentadmissioncontroller;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {
	
	@Pattern(regexp="[^0-9]*")
	private String name;
	
	@Size(min=2,max=31) @IsValidHobby() /*@IsValidHobby(listOfValidHobbies="Soccer")*/  /*@IsValidHobby(listOfValidHobbies="Music|Football|Critic|Hockey")*/
	private String hobby;
	
	@Max(2222)
	private Long mobile;
	
	@Past(message="date of birth must be in the past")
	private Date dob;
	private ArrayList<String> studentSkills;
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}

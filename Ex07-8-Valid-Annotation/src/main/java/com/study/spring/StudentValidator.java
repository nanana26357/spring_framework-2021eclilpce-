package com.study.spring;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


public class StudentValidator implements Validator
{
	@Override
	public boolean supports(Class<?> arg0) {
		return Student.class.isAssignableFrom(arg0);
	}
	
	
	@Override
	public void validate(Object obj, Errors errors) {
		System.out.println("validate()");
		Student studnet = (Student)obj;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "trouble");
		
		int studentId = studnet.getId();
		if(studentId == 0) {
			System.out.println("studentId is 0");
			errors.rejectValue("id", "trouble");
		}
	}


}

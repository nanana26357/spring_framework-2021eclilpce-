package com.study.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		
		model.addAttribute("name", "홍길동" );
		
		return "home";
	}
	
	@RequestMapping(value = "/mytest1", method = RequestMethod.GET)
	public String home1(Locale locale, Model model) {
		

		return "mytest1";
	}
	
}

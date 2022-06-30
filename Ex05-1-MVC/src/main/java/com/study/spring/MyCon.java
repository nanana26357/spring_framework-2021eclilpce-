package com.study.spring;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyCon
{
	@RequestMapping(value = "/mytest2", method = RequestMethod.GET)
	public String mytest2(Locale locale, Model model) {
		
		
//		model.addAttribute("serverTime", formattedDate );
		
		return "mytest2";
	}
}

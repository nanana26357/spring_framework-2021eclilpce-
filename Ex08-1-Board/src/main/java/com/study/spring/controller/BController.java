package com.study.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.spring.command.BCommand;
import com.study.spring.command.BContentCommand;
import com.study.spring.command.BDeleteCommand;
import com.study.spring.command.BListCommand;
import com.study.spring.command.BReplyCommand;
import com.study.spring.command.BReplyViewCommand;
import com.study.spring.command.BWriteCommand;

@Controller
public class BController
{
	BCommand command = null;
	
	@RequestMapping("/write_view")
	public String writeView(Model model) {
		return "write_view";
	}
	
	@RequestMapping("/write")
	public String writeView(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new BWriteCommand();
		command.execute(request, model);
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request,Model model) {
		command = new BListCommand();
		command.execute(request, model);
		return "list";
	}
	
	
	@RequestMapping("/content_view")
	public String content(HttpServletRequest request,Model model) {
		
		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(request, model);
		return "content_view";
	}
	
	@RequestMapping("/modify_view")
	public String modifyView(HttpServletRequest request, Model model) {
		return "modify_view";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new BContentCommand();
		command.execute(request, model);
		return "redirect:content_view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new BDeleteCommand();
		command.execute(request, model);
		return "redirect:list";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		command = new BReplyCommand();
		command.execute(request, model);
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		command = new BReplyViewCommand();
		command.execute(request, model);
		return "reply_view";
	}

}

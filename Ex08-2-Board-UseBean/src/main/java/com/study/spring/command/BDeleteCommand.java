package com.study.spring.command;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import com.study.spring.dao.BDao;

@Component("deleteHandler")
public class BDeleteCommand implements BCommand {
	
	@Override
	public void execute(HttpServletRequest request, Model model)
	{
		String bId = request.getParameter("bId");
		BDao dao = new BDao();
		dao.delete(bId);
	}

}

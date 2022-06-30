package com.study.spring.command;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.spring.dao.BDao;

@Component("writeHandler")
public class BWriteCommand implements BCommand {
	
	@Override
	public void execute(HttpServletRequest request, Model model)
	{

		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent);
	}

}

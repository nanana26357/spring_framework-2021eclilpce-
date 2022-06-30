package com.study.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass
{

	public static void main(String[] args)
	{
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext();	//생성
		
		ctx.load("classpath:beans.xml");		//설정 (classpath 대문자안됨
		System.out.println("aaaaa");

		ctx.refresh();
		System.out.println("Bbbbb");
		
		ctx.close();	//종료
		System.out.println("Cccccc");

	}

}

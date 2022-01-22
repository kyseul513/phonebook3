package com.javaex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/board")		//주소의 공통부분인 /board 여기로 빼오기
public class Test {

	//필드
	//생성자
	//메소드 gs
	//메소드 일반
	@RequestMapping(value = "/list", method= {RequestMethod.GET, RequestMethod.POST})	//value와 method 입력 없이 /list만 써도 모든 기능 사용하는 것.
					//TestPrint의 주소가 list로 지정됨.		//주소로 쳐서 접근하는건 GET방식. POST는 폼에서...
	public String TestPrint() {
		System.out.println("TestPrint");
		
		return "/WEB-INF/views/Test.jsp";
	}
	
	@RequestMapping(value = "/writeForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String TestPrint2() {
		System.out.println("TestPrint2");
		
		return "/WEB-INF/views/Test.jsp";
	}
	
	@RequestMapping(value = "/write", method= {RequestMethod.GET, RequestMethod.POST})
	public String TestPrint3() {
		System.out.println("TestPrint3");
		
		return "/WEB-INF/views/Test.jsp";
	}
}

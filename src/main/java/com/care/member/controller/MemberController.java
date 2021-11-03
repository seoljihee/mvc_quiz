package com.care.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("mem/memberView")
	public String memberview() {
		System.out.println("실행");
		return "member/MemberView";
	}
	
	@RequestMapping("mem/main")
	public String main() {
		return "member/Main";
	}
	
	@RequestMapping("mem/memberList")
	public String list() {
		return "member/MemberList";
	}
}

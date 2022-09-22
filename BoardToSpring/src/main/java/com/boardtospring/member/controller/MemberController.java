package com.boardtospring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boardtospring.member.dto.MemberDTO;
import com.boardtospring.member.service.MemberService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/member") //URL에 /board 공통 적용
@RequiredArgsConstructor //final이 붙은 필드는 생성자를 자동생성
public class MemberController {
	private final MemberService memberService;
	
	//가입화면 출력
	@GetMapping("/join")
	public String join() {
		System.out.println("Join");
		return "member/join";
	}
	
	//가입 수행
	@PostMapping("/joinus")
	public void joinUs(HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		System.out.println("JoinUS!");
		
		String memberID = request.getParameter("memberID");
		String memberPW = request.getParameter("memberPW");
		String memberNickname = request.getParameter("memberNickname");
		
		MemberDTO memberDto = new MemberDTO(memberID, memberPW, memberNickname);
		memberService.join(memberDto);
	}
}

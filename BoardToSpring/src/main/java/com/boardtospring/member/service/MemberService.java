package com.boardtospring.member.service;

import org.springframework.stereotype.Service;

import com.boardtospring.member.dto.MemberDTO;
import com.boardtospring.member.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberService {
	private final MemberMapper memberMapper;
	public void join(final MemberDTO memberDto) {
		memberMapper.join(memberDto);
	}
	
}

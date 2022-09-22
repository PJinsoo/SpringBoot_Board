package com.boardtospring.member.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.boardtospring.member.dto.MemberDTO;

@Mapper
public interface MemberMapper {
	void join(MemberDTO memberDto);
}

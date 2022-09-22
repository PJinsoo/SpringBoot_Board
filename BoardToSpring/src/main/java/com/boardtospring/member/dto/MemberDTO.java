package com.boardtospring.member.dto;

import java.sql.Date;

import lombok.Getter;

@Getter
public class MemberDTO {
	private int UID;
	private String memberID;
	private String memberPW;
	private String memberNickname;
	private Date joinDate;
	
	public MemberDTO(String memberID, String memberPW, String memberNickname){
		super();
		this.memberID = memberID;
		this.memberPW = memberPW;
		this.memberNickname = memberNickname;
	}
}

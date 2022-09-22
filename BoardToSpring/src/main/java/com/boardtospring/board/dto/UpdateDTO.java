package com.boardtospring.board.dto;

import java.sql.Date;

import lombok.Getter;

@Getter
public class UpdateDTO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private int viewCount;
	private Date postTime;
	
	public UpdateDTO(int boardNo, String title, String content) {
		super();
		this.boardNo = boardNo;
		this.title = title;
		this.content = content;
	}
}

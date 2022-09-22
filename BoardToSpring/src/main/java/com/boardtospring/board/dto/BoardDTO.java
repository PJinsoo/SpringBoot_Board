package com.boardtospring.board.dto;

import java.sql.Date;

import lombok.Getter;

@Getter
public class BoardDTO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private int viewCount;
	private Date postTime;
	
	//게시글 작성 생성자
	public BoardDTO(String title, String writer, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
}

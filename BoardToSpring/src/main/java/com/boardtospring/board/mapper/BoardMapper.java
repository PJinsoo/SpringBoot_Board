package com.boardtospring.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boardtospring.board.dto.BoardDTO;
import com.boardtospring.board.dto.UpdateDTO;

@Mapper
public interface BoardMapper {
	//게시글 목록
	List<BoardDTO> boardList();
	
	//게시글 조회
	BoardDTO postView(int boardNo);
	
	//게시글 작성
	void insert(BoardDTO boardDto);
	
	//게시글 수정 페이지 로드
	BoardDTO edit(int boardNo);
	
	//게시글 수정
	void update(UpdateDTO updateDto);
	
	//게시글 삭제
	void delete(int boardNo);
}

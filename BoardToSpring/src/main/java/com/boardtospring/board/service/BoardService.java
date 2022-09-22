package com.boardtospring.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.boardtospring.board.dto.BoardDTO;
import com.boardtospring.board.dto.UpdateDTO;
import com.boardtospring.board.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

@Service //게시글 서비스
@RequiredArgsConstructor
public class BoardService {
	private final BoardMapper boardMapper;
	
	//게시글 목록
	public List<BoardDTO> boardList(){
		return boardMapper.boardList();
	}
	
	//게시글 조회
	public BoardDTO postView(final int boardNo) {
		return boardMapper.postView(boardNo);
	}
	
	//게시글 작성
	public void insert(final BoardDTO boardDto) {
		boardMapper.insert(boardDto);
	}
	
	//게시글 수정 페이지 로드
	public BoardDTO edit(final int boardNo) {
		return boardMapper.edit(boardNo);
	}
	
	//게시글 수정
	public void update(final UpdateDTO updateDto) {
		boardMapper.update(updateDto);
	}
	
	//게시글 삭제
	public void delete(final int boardNo) {
		boardMapper.delete(boardNo);
	}
}

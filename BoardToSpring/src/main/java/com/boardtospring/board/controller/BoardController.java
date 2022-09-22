package com.boardtospring.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boardtospring.board.dto.BoardDTO;
import com.boardtospring.board.dto.UpdateDTO;
import com.boardtospring.board.service.BoardService;

import lombok.RequiredArgsConstructor;

@Controller //게시판 컨트롤러
@RequestMapping("/board") //URL에 /board 공통 적용
@RequiredArgsConstructor //final이 붙은 필드는 생성자를 자동생성
public class BoardController {
	private final BoardService boardService;
	
	//메인화면
	@GetMapping("/")
	public String boardMain() {
		System.out.println("Main");
		return "board/main";
	}
	
	//게시판 목록
	@GetMapping("list")
	public String boardList(Model model) {
		System.out.println("List");
		
		List<BoardDTO> list = boardService.boardList();
		model.addAttribute("list", list);
		
		return "board/list";
	}
	
	//게시글 조회
	@GetMapping("viewPost")
	public String openPost(@RequestParam final int boardNo, Model model) {
		System.out.println("View");
		
		BoardDTO post = boardService.postView(boardNo);
		model.addAttribute("post", post);

		return "board/viewPost";
	}
	
	//게시글 작성 페이지 로드
	@GetMapping("newPost")
	public String newPost() {
		System.out.println("NewPost");
		return "board/insert";
	}
	
	//게시글 작성 수행
	@PostMapping("insert")
	public void insert(HttpServletRequest request, HttpServletResponse response)
		throws Exception {
		System.out.println("Insert");
		
		String postTitle = request.getParameter("postTitle");
		String postWriter = request.getParameter("postWriter");
		String postContent = request.getParameter("postContent");
		
		BoardDTO boardDto = new BoardDTO(postTitle, postWriter, postContent);
		boardService.insert(boardDto);
	}
	
	
	//게시글 수정 페이지 로드
	@GetMapping("edit")
	public String edit(@RequestParam final int boardNo, Model model) {
		System.out.println("Edit");
		
		BoardDTO edit = boardService.edit(boardNo);
		model.addAttribute("edit", edit);
		
		return "board/edit";
	}
	
	//게시글 수정 수행
	@PostMapping("update")
	public void update(HttpServletRequest request, HttpServletResponse response)
		throws Exception{
		System.out.println("Update");
		
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		String editTitle = request.getParameter("editTitle");
		String editContent = request.getParameter("editContent");
		
		UpdateDTO updateDto = new UpdateDTO(boardNo, editTitle, editContent);
		boardService.update(updateDto);
	}
	
	//게시글 삭제
	@PostMapping("delete")
	public void delete(HttpServletRequest request, HttpServletResponse response)
		throws Exception{
		System.out.println("Delete");
		
		int boardNo = Integer.parseInt(request.getParameter("boardNo"));
		
		boardService.delete(boardNo);
	}
}

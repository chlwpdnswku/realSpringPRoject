package com.jeun.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jeun.domain.BoardVO;
import com.jeun.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	BoardService service;

	@GetMapping("/list")
	public void list(Model model) throws Exception {
		
		List<BoardVO> list= null;
		list =service.list();
		
		model.addAttribute("list",list); 
	}
}

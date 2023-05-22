package com.jeun.service;

import java.util.List;

import com.jeun.domain.BoardVO;
import com.jeun.framwork.util.Criteria;

public interface BoardService {
	

	
	public List<BoardVO> getPostList();
	
	public BoardVO searchPostId(Long id);
	
	public boolean insert(BoardVO vo);
	
	public boolean update(BoardVO vo);
	
	public boolean delete(int id);
	
	public int getTotCnt();
	//paging
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	
}


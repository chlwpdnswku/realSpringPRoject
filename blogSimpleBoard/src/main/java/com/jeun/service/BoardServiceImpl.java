package com.jeun.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jeun.dao.BoardDAO;
import com.jeun.domain.BoardVO;


@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO dao;

	public List<BoardVO> list()  {
		// TODO Auto-generated method stub
		try {
			return dao.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}

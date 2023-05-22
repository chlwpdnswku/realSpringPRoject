package com.jeun.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jeun.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	
	@Inject
	private SqlSession sql;
	
	private static String namespace = "com.jeun.mapper.board";
	
	public List<BoardVO> list() throws Exception {
	
		return sql.selectList(namespace +".list");
		
	}

}

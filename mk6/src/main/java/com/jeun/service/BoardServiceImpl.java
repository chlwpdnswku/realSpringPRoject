package com.jeun.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.base.Strings;
import com.jeun.domain.BoardVO;
import com.jeun.domain.TagVO;
import com.jeun.framwork.util.Criteria;
import com.jeun.mapper.BoardMapper;


@Service
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardMapper mapper;

	public List<BoardVO> getPostList() {
		// TODO Auto-generated method stub
		return mapper.getPostList();
	}


	public BoardVO searchPostId(Long id) {
		return mapper.searchPostId(id);
	}

	// int : affected row count
	public boolean insert(BoardVO vo) {
		return mapper.insert(vo) == 1;
	}

	public boolean update(BoardVO vo) {
		return mapper.update(vo) <= 1;
	}

	public boolean delete(int id) {
		return mapper.delete(id) <= 1;
	}
	
	public int getTotCnt() {
		return mapper.getTotCnt();
	}
	
	//paging
	public List<BoardVO> getListWithPaging(Criteria cri){
		if(Strings.isNullOrEmpty(cri.getSearchWords()))
		{
			return getPostList();
		}
		
		List<TagVO> list=Arrays.asList(
				cri.getSearchWords().split(" "))	
				.stream().map(k->new TagVO(k))
				.collect(Collectors.toList());
	
		return mapper.getListWithPagingBySearch(cri,list);
	}
	
	
	

}

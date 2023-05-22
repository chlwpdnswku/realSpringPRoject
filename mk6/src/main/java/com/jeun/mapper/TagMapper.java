package com.jeun.mapper;

import java.util.List;

import com.jeun.domain.TagVO;

public interface TagMapper {
	
	List<TagVO> getListExist(List<TagVO> listTag);
	int insert(List<TagVO> listNew);
	
	
}

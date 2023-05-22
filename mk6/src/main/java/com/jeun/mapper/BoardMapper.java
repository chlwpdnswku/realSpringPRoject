package com.jeun.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jeun.domain.BoardVO;
import com.jeun.domain.TagVO;
import com.jeun.framwork.util.Criteria;

public interface BoardMapper {
	
	public List<BoardVO> getPostList();
	

	public BoardVO searchPostId(Long id);
	
	public int insert(BoardVO vo);

	public int update(BoardVO vo);
	
	public int delete(int id);
	
	public int getTotCnt();
	//paging
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public List<BoardVO> getListWithPagingBySearch(@Param("cri") Criteria cri, @Param("list") List<TagVO> list);
	
	//진짜 테그 집어넣기 ?
	public int insertTagRel(@Param("objId") int objId ,@Param("tags") List<TagVO> list );
	
	
	
}

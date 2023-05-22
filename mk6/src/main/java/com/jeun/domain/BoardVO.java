package com.jeun.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class BoardVO {
	
	private int id;
	private String title;
	private String content;
	private String author;
	//등록 
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dateProp;
	
	private Date regDate;
	private Date updateDate;
	
	//pagenation
	private List<TagVO> tags;

}

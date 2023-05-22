package com.jeun.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TagVO {
	
	private int id;
	
	private String word;

	public TagVO(int id, String word) {
		this.id = id;
		this.word = word;
	}

	public TagVO(String word) {
		this.word=word;
	}
	
}

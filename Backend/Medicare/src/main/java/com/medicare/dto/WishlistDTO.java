package com.medicare.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WishlistDTO {
	private long wid;
	private long uid;
	private long pid;
	public WishlistDTO(long uid, long pid) {
		super();
		this.uid = uid;
		this.pid = pid;
	}
	

}
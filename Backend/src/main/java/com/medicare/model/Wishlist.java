package com.medicare.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wishlist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long wid;
	private long uid;
	private long pid;
	public Wishlist(long uid, long pid) {
		super();
		this.uid = uid;
		this.pid = pid;
	}
	
	

}
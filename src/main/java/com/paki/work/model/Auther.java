package com.paki.work.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user_plus")
public class Auther {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//auto-increment
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	 @Column(name = "username", unique = true)
	private String username;
	 
	 @Column(name = "create_time")
	private LocalDateTime createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}
	  
	
	
	

}

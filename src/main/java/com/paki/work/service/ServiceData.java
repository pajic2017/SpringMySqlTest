package com.paki.work.service;

import java.util.List;

import com.paki.work.model.Auther;

public interface ServiceData {
	
	   Auther saveUser(Auther user);

	   Auther findByUsername(Auther username);

	   List<Auther> findAll();

}

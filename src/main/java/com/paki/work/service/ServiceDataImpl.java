package com.paki.work.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paki.work.model.Auther;
import com.paki.work.model.RepoData;

@Service
public class ServiceDataImpl implements ServiceData {
	
	@Autowired
	private RepoData repo;

	@Override
	public Auther saveUser(Auther user) {
		
		return repo.save(user);
	}

	@Override
	public Auther findByUsername(Auther username) {
		
		return null;
	}

	@Override
	public List<Auther> findAll() {
		
		return repo.findAll();
	}

}

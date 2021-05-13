package com.paki.work.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoData extends JpaRepository<Auther, Long> {
	
	//findBy + fieldName
    Optional<Auther> findByUsername(String username);

}

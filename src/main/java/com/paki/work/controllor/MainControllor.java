package com.paki.work.controllor;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paki.work.model.Auther;
import com.paki.work.service.ServiceData;

@RestController
@RequestMapping("api/user")//pre-path for all methods
public class MainControllor {
	
	@Autowired
	private ServiceData service;
	
	@PostMapping
	public ResponseEntity<?> saveUser(@RequestBody Auther user){
		return (ResponseEntity<?>) new ResponseEntity<>(service.saveUser(user), HttpStatus.CREATED);
		
	}
	
	@GetMapping
    public ResponseEntity<?> getAllUsers(){
        return ResponseEntity.ok(service.findAll());
    }
}

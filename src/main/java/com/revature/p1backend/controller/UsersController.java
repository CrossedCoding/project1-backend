package com.revature.p1backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p1backend.model.Users;
import com.revature.p1backend.service.UsersService;
@RestController
public class UsersController {
	@Autowired
	UsersService userService;
	
	@GetMapping("/users")
	public List<Users> getUsers() {
		return userService.findAll();
	}
	
	@GetMapping("/users/{username}")
	public Users getUserByUsername(@PathVariable String username) {
		return userService.viewUser(username);
	}
	
	@PutMapping("/users")
	public Users updateUser(@RequestBody Users u) {
		
		return userService.updateUser(u.getId(), u);
	}
}

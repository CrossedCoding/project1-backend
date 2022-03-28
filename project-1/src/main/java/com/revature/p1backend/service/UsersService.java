package com.revature.p1backend.service;

import java.util.List;

import com.revature.p1backend.model.Users;

public interface UsersService {
	
	public Users userLogin(String username, String password);
	public Users userLogout();
	
	public Users viewUser (String username);
	public Users updateUser(int id, Users users);
	
	public List<Users> findAll();

}

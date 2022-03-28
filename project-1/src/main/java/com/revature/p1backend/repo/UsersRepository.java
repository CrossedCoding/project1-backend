package com.revature.p1backend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.p1backend.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	
	public Users getUserByUsernameAndPassword(String username,String password);
	
	public Users getUserByUsername(String username);

}

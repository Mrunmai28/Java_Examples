package com.example.user.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.user.entity.User;

@Component
public interface UserService {
	
	User addUser(User user);
	
	List<User> getAllUsers();
	
	User getUserById(Long userId);
	
	User updateUser(Long userId,User user);
	
	void deleteUserById(Long userId);
	
	void deleteAllUser();
	
	boolean isUserExists(Long userId);
	

}

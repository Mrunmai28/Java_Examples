package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.User;
import com.example.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/add")
	public ResponseEntity<User> addUser(@RequestBody User user)
	{
		User u=userService.addUser(user);
		return new ResponseEntity<>(u,HttpStatus.CREATED);
	}
	@GetMapping("/get/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Long userId)
	{
		boolean isUser=userService.isUserExists(userId);
		if(isUser)
		{
			User u=userService.getUserById(userId);
			return new ResponseEntity<>(u,HttpStatus.OK);
		}
		else
		{
			System.out.print("No user found");
			return null;
		}
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAllUser(){
		return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
	}
	@PutMapping("/update/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable Long userId,@RequestBody User u)
	{
		boolean isUser=userService.isUserExists(userId);
		if(isUser)
		{
			return new ResponseEntity<>(userService.updateUser(userId, u),HttpStatus.OK);
		}
		else {
			System.out.print("No user found");
			return null;
		}
	}
	@DeleteMapping("/delete/{userId}")
	public void deleteUserById(@PathVariable Long userId)
	{
		boolean isUser=userService.isUserExists(userId);
		if(isUser)
		{
			userService.deleteUserById(userId);
		}
		else
		{
			System.out.print("No user found");
		}
	}
	@DeleteMapping("/deleteAll")
	public void deleteAllUser(){
		userService.deleteAllUser();
	}
}


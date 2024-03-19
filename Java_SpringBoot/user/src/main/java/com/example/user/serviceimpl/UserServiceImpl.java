package com.example.user.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import com.example.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {
     @Autowired
	 private UserRepository userRepo;
     
	@Override
	public User addUser(User user) {
		return userRepo.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public User getUserById(Long userId) {
		//Optional<User> op=userRepo.findById(userId);
		//return op.get();
		return userRepo.findById(userId).get();
	}

	@Override
	public User updateUser(Long userId,User user) {
		User u=userRepo.findById(userId).get();
		u.setFirstName(user.getFirstName());
		u.setLastName(user.getLastName());
		u.setEmail(user.getEmail());
		return userRepo.save(u);
	}

	@Override
	public void deleteUserById(Long userId) {
		userRepo.deleteById(userId);
	}

	@Override
	public void deleteAllUser() {
		userRepo.deleteAll();
		
	}

	@Override
	public boolean isUserExists(Long userId) {
		return userRepo.existsById(userId);
	}

}

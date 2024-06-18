package com.example.a.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.a.Entity.User;
import com.example.a.Repository.UserRepository;

@Service
public class UserService {
private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public <S> User saveUser(User user) {
		return userRepository.saveAll((Iterable<S>) user);
	}
	public List<User> getAllUsers() {
		return (List<User>) userRepository.findAll();
	}
	public Optional<User> getUserById(Long userId) {
		return userRepository.findById(userId);
	}
	public User updateUser(Long userId, User updatedUser) {
		Optional<User> existingUser = userRepository.findById(userId);
		if (existingUser.isPresent()) {
			User user = existingUser.get();
			user.setName(updatedUser.getName());
			return userRepository.saveAll((Iterable<S>) user);
		} else {
			throw new RuntimeException("User not found");
		}
	}
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}
	public User updateUser1(Long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}
}


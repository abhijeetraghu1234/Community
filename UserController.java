package com.example.a.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.a.Entity.User;
import com.example.a.Service.UserService;


@RestController
@RequestMapping("/v1")
public class UserController {

	@Autowired
	private final UserService userService;


	public UserController(UserService userService) {
		this.userService = userService;
	}
	@PostMapping("/V1")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User newUser = userService.saveUser(user);
		return ResponseEntity.ok(newUser);
	}
	@GetMapping("/auth")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long Id) {
		Optional<User> user = userService.getUserById(Id);
		return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long Id, @RequestBody User user) {
		User updatedUser = userService.updateUser(Id,user);
		return ResponseEntity.ok(updatedUser);
	}
	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long Id) {
		userService.deleteUser(Id);
		return ResponseEntity.ok("User deleted successfully");
	}


}

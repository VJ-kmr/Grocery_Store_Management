package com.onlineStores.controller;

import java.util.List;

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

import com.onlineStores.model.Item;
import com.onlineStores.model.Users;
import com.onlineStores.service.ItemService;
import com.onlineStores.service.UserService;

@RestController
@RequestMapping("/Online_Store/")
public class UserController {
	@Autowired
	private UserService usersvc;

	@GetMapping("/user")
	public List<Users> getAllUsers() {
		return usersvc.findAll();
	}
	
	@GetMapping("/user/{userMail}")
	public ResponseEntity<Users> getUsers(@PathVariable String userMail ) {
		Users u = usersvc.findById(userMail);
		return ResponseEntity.ok(u);
	}

	@PostMapping("/user")
	public ResponseEntity<Users> addUsers(@RequestBody Users u) {
		return ResponseEntity.ok(usersvc.addUsers(u));
	}
	@PutMapping("/user/{userMail}")
	public ResponseEntity<Users> updateItem(@PathVariable String userMail, @RequestBody Users u) {
		return ResponseEntity.ok(usersvc.updateUsers(userMail, u));
	}
	
	@DeleteMapping("/user/{userMail}")
	public ResponseEntity<String> deleteUsers(@PathVariable String userMail) {
		return ResponseEntity.ok(usersvc.deleteUsers(userMail));
	}
	
//	@PostMapping("/user/purchase/{itemId}")
//	public ResponseEntity<String> purchasProduct(int itemId){
//		
//	}
	
	
	
	
	
}

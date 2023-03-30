package com.onlineStores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineStores.dao.UserDao;
import com.onlineStores.model.Users;

@Service
public class UserService {
	@Autowired
	private UserDao udao;

	public Users addUsers(Users user) {
		return udao.save(user);
	}
	public List<Users> findAll(){
		return udao.findAll();
	}
	public Users findById(String userMail) {
		Users u = udao.findById(userMail).orElse(null) ;
		if(u != null) 
		{
			return u;
		}
		else
			return null;
	}
	public Users updateUsers(String userMail, Users u1) {
		udao.deleteById(userMail);
		return udao.save(u1);
	}
	
	public String deleteUsers(String userMail) {
		udao.deleteById(userMail);
		return "Successfully Deleted";
	}
	
//	public String purchaseProduct(int itemId)
//	
	
	
	
	
	
}

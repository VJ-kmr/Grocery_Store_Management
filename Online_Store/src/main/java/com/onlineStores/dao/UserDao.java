package com.onlineStores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineStores.model.Users;

public interface UserDao extends JpaRepository<Users,String>{

}

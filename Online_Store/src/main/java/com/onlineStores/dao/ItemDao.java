package com.onlineStores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlineStores.model.Item;

public interface ItemDao extends JpaRepository<Item,Integer>{

}

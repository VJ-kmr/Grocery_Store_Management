package com.onlineStores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineStores.dao.ItemDao;
import com.onlineStores.model.Item;

@Service
public class ItemService {
	@Autowired
	private ItemDao idao;

	public Item addItem(Item item) {
		return idao.save(item);
	}

	public List<Item> findAll(){
		return idao.findAll();
	}
	
	public Item findById(int itemId) {
		Item i = idao.findById(itemId).orElse(null) ;
		if(i != null) 
		{
			return i;
		}
		else
			return null;
	}
	
	public Item updateItem(int itemId, Item i1) {
		idao.deleteById(itemId);
		return idao.save(i1);
	}
	
	public String deleteItem(int itemId) {
		idao.deleteById(itemId);
		return "Successfully Deleted";
	}
	
}

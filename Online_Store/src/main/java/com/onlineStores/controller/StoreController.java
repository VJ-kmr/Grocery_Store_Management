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
import com.onlineStores.service.ItemService;

@RestController
@RequestMapping("/Online_Store/")
public class StoreController {
	@Autowired
	private ItemService itemsvc;

	@GetMapping("/item")
	public List<Item> getAllItem() {
		return itemsvc.findAll();
	}

	@GetMapping("/item/{itemId}")
	public ResponseEntity<Item> getItem(@PathVariable int itemId) {
		Item i = itemsvc.findById(itemId);
		return ResponseEntity.ok(i);
	}

	@PostMapping("/item")
	public ResponseEntity<Item> addItem(@RequestBody Item i) {
		return ResponseEntity.ok(itemsvc.addItem(i));
	}

	@PutMapping("/item/{itemId}")
	public ResponseEntity<Item> updateItem(@PathVariable int itemId, @RequestBody Item i) {
		return ResponseEntity.ok(itemsvc.updateItem(itemId, i));
	}

	@DeleteMapping("/item/{itemId}")//http://localhost:8080/Online_Store/item/101
	public ResponseEntity<String> deleteItem(@PathVariable int itemId) {
		return ResponseEntity.ok(itemsvc.deleteItem(itemId));
	}

}
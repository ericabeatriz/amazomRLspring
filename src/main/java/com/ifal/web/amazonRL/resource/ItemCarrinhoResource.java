package com.ifal.web.amazonRL.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ifal.web.amazonRL.modelo.ItemCarrinho;
import com.ifal.web.amazonRL.repository.ItemCarrinhoRepository;


  
	@RestController
	@RequestMapping("/api/itemcarrinho")
	public class ItemCarrinhoResource {



		@Autowired
		ItemCarrinhoRepository itemCarrinhoRepository;

		@GetMapping
		public List<ItemCarrinho> get(){
			return itemCarrinhoRepository.findAll();
		}

		@GetMapping("{id}")
		public ItemCarrinho get(@PathVariable("id") Integer id) {
			return itemCarrinhoRepository.getOne(id);
		}

		@PostMapping
		public void save(@RequestBody ItemCarrinho itemCarrinho) {
			itemCarrinhoRepository.save(itemCarrinho);
		}

		@DeleteMapping("{id}")
		public void dalete(@PathVariable ("id") Integer id) {		
			itemCarrinhoRepository.deleteById(id);	
		}

	}




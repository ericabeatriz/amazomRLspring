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

import com.ifal.web.amazonRL.modelo.Carrinho;
import com.ifal.web.amazonRL.repository.CarrinhoRepository;

@RestController
@RequestMapping("/api/carrinho")
public class CarrinhoResource {

	@Autowired
	CarrinhoRepository carrinhoRepository;
	
	@GetMapping
	public List<Carrinho> get(){
		return carrinhoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Carrinho get(@PathVariable("id") Integer id) {
		return carrinhoRepository.getOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Carrinho carrinho) {
		carrinhoRepository.save(carrinho);
	}
	
	@DeleteMapping("{id}")
	public void dalete(@PathVariable ("id") Integer id) {		
		carrinhoRepository.deleteById(id);	
	}
	
}

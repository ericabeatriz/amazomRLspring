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


import com.ifal.web.amazonRL.modelo.Cliente;
import com.ifal.web.amazonRL.repository.ClienteRepository;


    @RestController
    @RequestMapping("/api/cliente")
    public class ClienteResource {
	
	

		@Autowired
		ClienteRepository clienteRepository;
		
		@GetMapping
		public List<Cliente> get(){
			return clienteRepository.findAll();
		}
		
		@GetMapping("{id}")
		public Cliente get(@PathVariable("id") Integer id) {
			return clienteRepository.getOne(id);
		}
		
		@PostMapping
		public void save(@RequestBody Cliente cliente) {
			clienteRepository.save(cliente);
		}
		
		@DeleteMapping("{id}")
		public void dalete(@PathVariable ("id") Integer id) {		
			clienteRepository.deleteById(id);	
		}
		
	}



	


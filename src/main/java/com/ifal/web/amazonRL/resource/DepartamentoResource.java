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


import com.ifal.web.amazonRL.modelo.Departamento;
import com.ifal.web.amazonRL.repository.DepartamentoRepository;



@RestController
@RequestMapping("/api/departamento")
public class DepartamentoResource {



	@Autowired
	DepartamentoRepository departamentoRepository;

	@GetMapping
	public List<Departamento> get(){
		return departamentoRepository.findAll();
	}

	@GetMapping("{id}")
	public Departamento get(@PathVariable("id") Integer id) {
		return departamentoRepository.getOne(id);
	}

	@PostMapping
	public void save(@RequestBody Departamento departamento) {
		departamentoRepository.save(departamento);
	}

	@DeleteMapping("{id}")
	public void dalete(@PathVariable ("id") Integer id) {		
		departamentoRepository.deleteById(id);	
	}

}


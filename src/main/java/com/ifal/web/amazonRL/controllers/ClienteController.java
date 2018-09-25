package com.ifal.web.amazonRL.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ifal.web.amazonRL.modelo.Cliente;
import com.ifal.web.amazonRL.repository.ClienteRepository;



@Controller
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	ClienteRepository clienteRepository;
	
	
	@GetMapping(value = "/list")
	public String list(ModelMap model) {
		List<Cliente> clientes =  clienteRepository.findAll();
		model.addAttribute("clientesList", clientes);
		
		return "Cliente/list";
	}
	

}


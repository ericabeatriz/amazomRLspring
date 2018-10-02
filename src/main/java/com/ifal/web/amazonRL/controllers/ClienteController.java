package com.ifal.web.amazonRL.controllers;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping(value = { "/new" })
	public String newCliente(ModelMap model) {
		
		Cliente cliente = new Cliente();
		model.addAttribute("cliente", cliente);
		model.addAttribute("edit", false);		
		return "Cliente/form";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveCliente(@RequestParam Map<String, String> params) {
		//clienteRepository.saveAndFlush(cliente);
		
		Cliente cliente =new Cliente();
		cliente.setNome(params.get("nome"));
		
		cliente.setEmail(params.get("email"));
		
		clienteRepository.saveAndFlush(cliente);
			
		return "redirect:/cliente/list";
	}
	

}


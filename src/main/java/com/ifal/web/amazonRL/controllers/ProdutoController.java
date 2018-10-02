package com.ifal.web.amazonRL.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ifal.web.amazonRL.modelo.Cliente;
import com.ifal.web.amazonRL.modelo.Produto;
import com.ifal.web.amazonRL.repository.ClienteRepository;
import com.ifal.web.amazonRL.repository.ProdutoRepository;


   @Controller
   @RequestMapping("/produto")
   public class ProdutoController {
	
	    @Autowired
		ProdutoRepository produtoRepository;
		
		
		@GetMapping(value = "/list")
		public String list(ModelMap model) {
			List<Produto> produtos =  produtoRepository.findAll();
		    model.addAttribute("produtosList", produtos);
			
			return "Produto/list";
		}
		

	}





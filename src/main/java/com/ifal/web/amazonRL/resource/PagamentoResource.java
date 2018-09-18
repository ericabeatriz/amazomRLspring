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

import com.ifal.web.amazonRL.modelo.Pagamento;
import com.ifal.web.amazonRL.repository.PagamentoRepository;


	@RestController
	@RequestMapping("/api/pagamento")
	public class PagamentoResource {



		@Autowired
	    PagamentoRepository pagamentoRepository;

		@GetMapping
		public List<Pagamento> get(){
			return pagamentoRepository.findAll();
		}

		@GetMapping("{id}")
		public Pagamento get(@PathVariable("id") Integer id) {
			return pagamentoRepository.getOne(id);
		}

		@PostMapping
		public void save(@RequestBody Pagamento pagamento) {
			pagamentoRepository.save(pagamento);
		}

		@DeleteMapping("{id}")
		public void dalete(@PathVariable ("id") Integer id) {		
			pagamentoRepository.deleteById(id);	
		}

	}



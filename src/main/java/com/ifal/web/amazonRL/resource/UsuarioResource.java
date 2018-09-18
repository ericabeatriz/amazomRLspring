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

import com.ifal.web.amazonRL.modelo.Usuario;
import com.ifal.web.amazonRL.repository.UsuarioRepository;


 
	@RestController
	@RequestMapping("/api/usuario")
	public class UsuarioResource {



		@Autowired
	    UsuarioRepository usuarioRepository;

		@GetMapping
		public List<Usuario> get(){
			return usuarioRepository.findAll();
		}

		@GetMapping("{id}")
		public Usuario get(@PathVariable("id") Integer id) {
			return usuarioRepository.getOne(id);
		}

		@PostMapping
		public void save(@RequestBody Usuario usuario) {
			usuarioRepository.save(usuario);
		}

		@DeleteMapping("{id}")
		public void dalete(@PathVariable ("id") Integer id) {		
			usuarioRepository.deleteById(id);	
		}

	}





package com.zuptalents.desafio.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zuptalents.desafio.domain.Usuario;
import com.zuptalents.desafio.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired
	private UsuarioService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Usuario> find(@PathVariable Long id) {	
		Usuario obj = service.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	@ResponseStatus( HttpStatus.CREATED )
	public Usuario salva (@RequestBody Usuario user) {		
		return service.salva(user); 	
	}
}


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

import com.zuptalents.desafio.domain.AplicacaoVacina;
import com.zuptalents.desafio.service.AplicacaoVacinaService;

@RestController
@RequestMapping("/aplicacao-vacina")
public class AplicacaoVacinaResource {
	
	@Autowired
	 private AplicacaoVacinaService service;
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<AplicacaoVacina> find(@PathVariable Long id) {	
		AplicacaoVacina obj = service.buscar(id);
			
	    return ResponseEntity.ok().body(obj);	
	}
	@PostMapping
	@ResponseStatus( HttpStatus.CREATED )
	public AplicacaoVacina salva (@RequestBody AplicacaoVacina user) {		
		return service.salvar(user);
	}
}
	

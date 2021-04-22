package com.zuptalents.desafio.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zuptalents.desafio.domain.AplicacaoVacina;
import com.zuptalents.desafio.repository.aplicacaoVacinaRepository;

@Service
public class AplicacaoVacinaService {
	
	@Autowired
	 private aplicacaoVacinaRepository aplicacaovacinarepository;

	public AplicacaoVacina buscar(Long id) {
	Optional<AplicacaoVacina> obj = aplicacaovacinarepository.findById(id);
			return obj.orElse(null);		
	}
	
	public AplicacaoVacina salvar(AplicacaoVacina aplicacaovacina ) {
	aplicacaovacinarepository.save(aplicacaovacina);
			return aplicacaovacina;	
	}
}

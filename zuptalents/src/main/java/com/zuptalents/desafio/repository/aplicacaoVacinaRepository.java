package com.zuptalents.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zuptalents.desafio.domain.AplicacaoVacina;

@Repository
public interface aplicacaoVacinaRepository extends JpaRepository<AplicacaoVacina, Long> {

}

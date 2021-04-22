package com.zuptalents.desafio.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuptalents.desafio.domain.Usuario;
import com.zuptalents.desafio.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario buscar(Long id ) {
		Optional<Usuario> obj = usuarioRepository.findById(id);
		return obj.orElse(null);
	}
	
	public Usuario salva(Usuario usuario) {
		usuarioRepository.save(usuario);
		return usuario;	
	}
}

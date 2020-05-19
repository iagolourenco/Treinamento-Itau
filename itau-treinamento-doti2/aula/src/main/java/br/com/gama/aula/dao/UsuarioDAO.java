package br.com.gama.aula.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gama.aula.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{

	public Usuario findByEmailAndSenha(String email, String senha);
	
}

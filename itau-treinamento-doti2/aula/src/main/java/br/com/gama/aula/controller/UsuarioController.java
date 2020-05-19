package br.com.gama.aula.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.aula.dao.UsuarioDAO;
import br.com.gama.aula.model.Usuario;

@RestController //indica que a nossa classe vai responder via protocolos HTTP
public class UsuarioController {

	@Autowired //a implementação fica por conta do JPA
	private UsuarioDAO dao;

	@GetMapping("/usuarios")//nossa url pára executar esse metodo
	public ResponseEntity<ArrayList<Usuario>> getAllUsers(){
		ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		if (lista.size()>0) {
			return ResponseEntity.ok(lista);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/usuario/{id}")//nossa url pára executar esse metodo
	// o {id} é a variavel que sera recebida na url
	//o @PathVariable é responsavel por falar para o metodo, 
	//que o parametro vira da variavel da URL (oque estiver entre chaves)
	public ResponseEntity<Usuario> getUserById(@PathVariable int id){
		Usuario objeto = dao.findById(id).orElse(null);
		if(objeto==null) {
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok(objeto);
		}
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario usuario){
		Usuario usuarioLogado=dao.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		if(usuarioLogado==null) {
			return ResponseEntity.status(403).build();
			
		}
		else {
			return ResponseEntity.ok(usuarioLogado);
			//teste
		}
	}
}




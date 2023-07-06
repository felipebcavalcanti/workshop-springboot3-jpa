package com.educandoweb.projeto1.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.projeto1.entities.User;
/*RestConttorller é a anotation para a API REST, é a partir daqui que irão ter os endpoints, neste caso o GET*/
@RestController
/*RestMapping é aqui que ele vai mapear onde vai ser executado o endpoint, que no caso é em USERS*/
@RequestMapping(value="/users")
public class UserResource {
	/*GetMapping é aqui que ele vai fazer a requisicao de GET, mapeando as entidades*/
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Felipe", "9999999", "felipe@gmail.com", "12345");
		return ResponseEntity.ok().body(u);
	}
	
}

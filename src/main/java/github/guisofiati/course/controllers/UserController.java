package github.guisofiati.course.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import github.guisofiati.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Maria", "maria@gmail.com", "11999999999", "123456");
		return ResponseEntity.ok().body(user);
	}
}
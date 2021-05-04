package com.farmacia.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.farmacia.models.Categoria;
import com.farmacia.repositories.CategoriaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> getAll( ) {
		return ResponseEntity.ok(repository.findAll()); 
	}
	@GetMapping ("/id/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id) {
		Optional<Categoria> categoriaExistente  = repository.findById(id); 
		if (categoriaExistente.isPresent()) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(categoriaExistente.get());
		} else {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Categoria inexistente");
		}
	}

	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> getByDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}

	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categoria) {
		return ResponseEntity.status(201).body(repository.save(categoria));
}

	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categoria) {
		return ResponseEntity.status(202).body(repository.save(categoria));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}

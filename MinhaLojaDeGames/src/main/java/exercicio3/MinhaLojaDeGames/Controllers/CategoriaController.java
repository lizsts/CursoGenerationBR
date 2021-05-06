package exercicio3.MinhaLojaDeGames.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import exercicio3.MinhaLojaDeGames.Models.CategoriaModel;
import exercicio3.MinhaLojaDeGames.repository.CategoriaRepository;

@RestController
@CrossOrigin("*")
@RequestMapping("/categoria")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repositoryC;

	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll() {
		return ResponseEntity.ok(repositoryC.findAll());
	}
	
	@GetMapping("/id/{id}") 
	public ResponseEntity<CategoriaModel> getById(@PathVariable long idCategoria) {
		return repositoryC.findById(idCategoria).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());

	}
	@GetMapping("/pesquisaDescricao/{nomeC}/{descricaoC}")
	public ResponseEntity<?> getByNomeAndDescricao(@PathVariable String nome, @PathVariable String descricaoCategoria) {
		Optional<List<CategoriaModel>> categoria = repositoryC.findAllByNomeContainingAndDescricaoCategoriaContainingIgnoreCase(nome, descricaoCategoria);
		return categoria.map(pesq -> ResponseEntity.ok(pesq)).orElse(ResponseEntity.notFound().build());
	}
}
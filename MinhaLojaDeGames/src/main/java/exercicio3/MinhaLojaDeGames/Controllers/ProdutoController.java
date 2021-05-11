package exercicio3.MinhaLojaDeGames.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import exercicio3.MinhaLojaDeGames.Models.ProdutoModel;
import exercicio3.MinhaLojaDeGames.repository.ProdutoRepository;

public class ProdutoController {
	@Autowired
	private ProdutoRepository repositoryP;

	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAll() {
		return ResponseEntity.ok(repositoryP.findAll());
	}
	
	@GetMapping("/id/{id}") 
	public ResponseEntity<ProdutoModel> getById(@PathVariable long idProdutos) {
		return repositoryP.findById(idProdutos).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());

	}
	@GetMapping("/pesquisaDescricao/{nomeP}/{descricaoP}")
	public ResponseEntity<?> getByTituloAndDescricao(@PathVariable String titulo, @PathVariable String descricaoProdutos) {
		Optional<List<ProdutoModel>> produtos =
				repositoryP.findAllByTituloContainingAndDescricaoProdutosContainingIgnoreCase(titulo, descricaoProdutos);
		return produtos.map(pesq -> ResponseEntity.ok(pesq)).orElse(ResponseEntity.notFound().build());
}
}
package exercicio3.MinhaLojaDeGames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import exercicio3.MinhaLojaDeGames.Models.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> { 
	
	public Optional<List<ProdutoModel>> findAllByTituloContainingAndDescricaoProdutosContainingIgnoreCase(String titulo, String descricaoProdutos); 
	
	
}

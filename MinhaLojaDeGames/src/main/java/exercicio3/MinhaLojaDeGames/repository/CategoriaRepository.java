package exercicio3.MinhaLojaDeGames.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import exercicio3.MinhaLojaDeGames.Models.CategoriaModel;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long>{
 public Optional<List<CategoriaModel>> findAllByNomeContainingAndDescricaoCategoriaContainingIgnoreCase(String nome, String descricaoCategoria); 
 	
}

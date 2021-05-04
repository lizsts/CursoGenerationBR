package com.farmacia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmacia.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	
	public List<Produto> findAllByTituloContainingIgnoreCase(String titulo); 
	public List <Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
	public List <Produto> findAllByTituloContainingAndDescricaoContaining(String titulo, String descricao);

}

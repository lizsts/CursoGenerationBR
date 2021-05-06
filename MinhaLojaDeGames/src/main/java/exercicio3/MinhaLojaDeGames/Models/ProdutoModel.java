package exercicio3.MinhaLojaDeGames.Models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produtos_games")
public class ProdutoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProdutos; 
	
	@NotNull
	@Size(min = 5, max = 15)
	private String titulo; 
	@NotNull
	@Size(min = 5, max = 25) 
	private String descricaoProdutos;
	
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name = "fkCategoria", nullable = false)
	@JsonIgnoreProperties("produtos_games")
	private CategoriaModel fkCategoria; 
	
	public long getIdProdutos() {
		return idProdutos;
	}
	public void setIdProdutos(long idProdutos) {
		this.idProdutos = idProdutos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricaoProdutos() {
		return descricaoProdutos;
	}
	public void setDescricaoProdutos(String descricaoProdutos) {
		this.descricaoProdutos = descricaoProdutos;
	} 
	public CategoriaModel getFkCategoria() {
		return fkCategoria;
	}
	public void setFkCategoria(CategoriaModel fkCategoria) {
		this.fkCategoria = fkCategoria;
	}

}

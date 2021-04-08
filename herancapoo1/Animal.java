package herancapoo1;

public class Animal {
	private String nome;
	private String idade;

	public Animal() {

	}

	public Animal(String nome, String idade) {
		this.nome = nome;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

}

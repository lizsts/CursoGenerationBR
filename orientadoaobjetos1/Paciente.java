package orientadoaobjetos1;

public class Paciente {

	private String nome; 
	private String idade; 
	private String genero; 
	private String raca; 
	private String queixa; 
	
	public Paciente (String nome, String idade, String genero, String raca, String queixa)
	{
	this.nome = nome; 
	this.idade = idade; 
	this.genero = genero; 
	this.raca= raca; 
	this.queixa = queixa; 
	} 
	public void imprimirDados( ) 
	{
		System.out.println(nome+"\n"+idade+"\n"+genero+"\n"+raca+"\n"+queixa);
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getQueixa() {
		return queixa;
	}
	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}
	
}

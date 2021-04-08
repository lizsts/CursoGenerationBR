package herancapoo1;

public class Cachorro extends Animal {
	private String correr;
	private String latir;

	public Cachorro() {

	}

	public Cachorro(String nome, String idade, String correr, String latir) {
		super(nome, idade);
		this.correr = correr;
		this.latir = latir;

	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getLatir() {
		return latir;
	}

	public void setLatir(String latir) {
		this.latir = latir;
	}

}

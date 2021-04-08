package herancapoo1;

public class Cavalo extends Animal {
	private String correr;
	private String relinchar;

	public Cavalo() {

	}

	public Cavalo(String nome, String idade, String correr, String relinchar) {
		super(nome, idade);
		this.correr = correr;
		this.relinchar = relinchar;

	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}

	public String getRelinchar() {
		return relinchar;
	}

	public void setRelinchar(String relinchar) {
		this.relinchar = relinchar;
	}

}

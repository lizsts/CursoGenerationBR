package herancapoo1;

public class Preguica extends Animal {
	private String subirarvore;
	private String sonspreg;

	public Preguica() {

	}

	public Preguica(String nome, String idade, String subirarvore, String sonspreg) {

		super(nome, idade);

		this.subirarvore = subirarvore;
		this.sonspreg = sonspreg;
	}

	public String getSubirarvore() {
		return subirarvore;
	}

	public void setSubirarvore(String subirarvore) {
		this.subirarvore = subirarvore;
	}

	public String getSonspreg() {
		return sonspreg;
	}

	public void setSonspreg(String sonspreg) {
		this.sonspreg = sonspreg;
	}
}

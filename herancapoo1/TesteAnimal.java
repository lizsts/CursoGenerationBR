package herancapoo1;

public class TesteAnimal {
	public static void main(String[] args) {

		Cachorro bichin1 = new Cachorro();
		Cavalo bichin2 = new Cavalo();
		Preguica bichin3 = new Preguica();

		bichin1.setNome("Pulguinha");
		bichin1.setIdade("9 anos");
		bichin1.setCorrer("Ama correr");
		bichin1.setLatir("Late pra todo tipo de bicho");

		bichin2.setNome("Apolo");
		bichin2.setIdade("3 anos");
		bichin2.setCorrer("Corre até 60km/h");
		bichin2.setRelinchar("Relincha quando feliz");

		bichin3.setNome("Pipa");
		bichin3.setIdade("2 anos");
		bichin3.setSubirarvore("Sobe em árvores");
		bichin3.setSonspreg("Emite altos sons pelas narinas");

		System.out.println("\nNome do cachorro: " + bichin1.getNome() + "\nIdade: " + bichin1.getIdade() + "\n"
				+ bichin1.getCorrer() + "\n" + bichin1.getLatir());
		System.out.println("\nNome do cavalo: " + bichin2.getNome() + "\nIdade: " + bichin2.getIdade() + "\n"
				+ bichin2.getCorrer() + "\n" + bichin2.getRelinchar());
		System.out.println("\nNome da preguiça: " + bichin3.getNome() + "\nIdade: " + bichin3.getIdade() + "\n"
				+ bichin3.getSubirarvore() + "\n" + bichin3.getSonspreg());

	}
}
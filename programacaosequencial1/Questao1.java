package programacaosequencial1;
import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
		int anos, meses, dias, totaldias;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nQuantos anos completos voc� tem?");
		anos = ler.nextInt();
		System.out.println("\nAgora, quantos meses?");
		meses = ler.nextInt();
		System.out.println("\nE quantos dias?");
		dias = ler.nextInt();
		
		
		totaldias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("\nParab�ns!!! Voc� viveu exatamente "+totaldias+" dias." );
		
		
	}

}
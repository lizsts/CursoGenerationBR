package programacaosequencial1;
import java.util.Scanner;
public class Questao2 {
	public static void main(String[] args) {
		
		int dias, anos, meses, td;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("�timo, agora que voc� j� sabe quantos dias, confirma aqui: ");
		td = ler.nextInt(); 
		
		anos = td/365;
		meses = td%365 / 30;
		dias = td%365 % 30; 
		
		System.out.println("Voc� tem exatamente: "+anos+" ano(s) "+meses+ " meses e "+dias+ " dia(s).");
		
	}

}

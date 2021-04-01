package programacaosequencial1;
import java.util.Scanner;
public class Questao3 {
	
	public static void main(String[] args) {
		
		int seg, hr, min, ts; 
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o tempo (em segundos) gasto na fabricação de um sapato: ");
		ts = ler.nextInt(); 
		
		hr = ts/3600;
		min = ts%3600 /60;
		seg = ts % 3600 % 60;
		
		System.out.println("\nIsso equivale a: "+hr+" horas(s), "+min+" minuto(s) e "+seg+" segundo(s).");
				
		
	}

}
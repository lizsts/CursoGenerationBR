package exercicioferiado1;
import java.util.Scanner;
public class Questao4 {

	public static void main(String[] args) {
		
		int n1, n2, n3; 
		double media; 
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nDigite o primeiro número: "); 
		n1 = leia.nextInt(); 
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextInt(); 
		System.out.println("\nDigite o terceiro número: ");
		n3 = leia.nextInt(); 
		
		 media = (n1 + n2 + n3) / 3; 
		 
		 System.out.println("\nA média dos números é: "+media);
		
	}
}

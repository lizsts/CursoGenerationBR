package exercicioferiado1;
import java.util.Scanner;
public class Questao4 {

	public static void main(String[] args) {
		
		int n1, n2, n3; 
		double media; 
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nDigite o primeiro n�mero: "); 
		n1 = leia.nextInt(); 
		System.out.println("\nDigite o segundo n�mero: ");
		n2 = leia.nextInt(); 
		System.out.println("\nDigite o terceiro n�mero: ");
		n3 = leia.nextInt(); 
		
		 media = (n1 + n2 + n3) / 3; 
		 
		 System.out.println("\nA m�dia dos n�meros �: "+media);
		
	}
}

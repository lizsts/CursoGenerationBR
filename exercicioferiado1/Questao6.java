package exercicioferiado1;
import java.util.Scanner; 
public class Questao6 {

	public static void main(String[] args) {
		
	  float p1, p2; 
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("\nInforme o pre�o do produto: ");
		p1 = valor.nextFloat(); 
		
		p2  = Math.round(p1 - (p1 * 0.09)); 
		
		System.out.println("\nO pre�o com reajuste de 9% �: "+p2);
	}
}

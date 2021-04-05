package exercicioferiado1;
import java.util.Scanner; 
public class Questao6 {

	public static void main(String[] args) {
		
	  float p1, p2; 
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("\nInforme o preço do produto: ");
		p1 = valor.nextFloat(); 
		
		p2  = Math.round(p1 - (p1 * 0.09)); 
		
		System.out.println("\nO preço com reajuste de 9% é: "+p2);
	}
}

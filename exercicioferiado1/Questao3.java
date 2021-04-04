package exercicioferiado1;
import java.util.Scanner; 
public class Questao3 {
	
	public static void main(String[] args) {
		
		double valor, valor2; 
		
		Scanner leia = new Scanner (System.in); 
		
		System.out.println("\nEntre com um valor: ");
		valor = leia.nextDouble();
		 
		valor2 = (valor * 0.10) + valor; 
		
		System.out.println("\nO valor com reajuste de 10% é: "+valor2);
	}

}

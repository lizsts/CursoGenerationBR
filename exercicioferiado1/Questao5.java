package exercicioferiado1;
import java.util.Scanner;
public class Questao5 {

	public static void main(String[] args) {
		
		float saldo, saldo2; 
		
		Scanner valor = new Scanner(System.in);
		
		System.out.println("\nDigite o saldo: "); 
	     saldo = valor.nextFloat(); 
	
	     saldo2 = Math.round((saldo * 0.01) + saldo); 
		
	     System.out.println("\nO saldo com reajuste de 1% é: "+saldo2);

	}
}
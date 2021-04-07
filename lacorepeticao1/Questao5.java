package lacorepeticao1;
import java.util.Scanner; 
public class Questao5 {

	public static void main(String[] args) {
		
		int num, soma=0; 	 
		Scanner leia = new Scanner(System.in); 
		
		do { 
			
			System.out.println("\nDigite um número: ");
			num = leia.nextInt(); 
			
			soma = soma + num;
			
		} while (num != 0);
			
			System.out.println("\nA soma dos números digitados é: "+soma); 
		
	}
}

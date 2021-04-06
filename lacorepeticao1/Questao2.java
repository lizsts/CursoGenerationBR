package lacorepeticao1;
import java.util.Scanner; 
public class Questao2 {
    
	public static void main(String[] args) {
		int num, x, par=0, impar=0; 
		
		Scanner leia = new Scanner(System.in); 
		
		for (x=1; x<=10; x++) {
			System.out.println("\nDigite um número: ");
			num = leia.nextInt(); 
			
			if (num %2 == 0) {
			par++; 
				
			} else { 
				impar++;
			}
		}
		System.out.println("\nQuantidade de números pares: "+par);
		System.out.println("\nQuantidade de números ímpares: "+impar);
	}
}

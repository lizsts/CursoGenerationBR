package lacorepeticao1;
import java.util.Scanner; 
public class Questao6 {

	public static void main(String[] args) {
		
		int num, soma=0, media=0, mtres=0; 
		
		Scanner leia = new Scanner(System.in); 
		
		do { 
			System.out.println("\nDigite um n�mero: ");
			num = leia.nextInt(); 
			
		if (num%3 ==0) {
			mtres++; 
		   soma = soma + num; 	
			
		}
	  } while (num != 0);
		  media = soma / (mtres - 1);	
		  System.out.println("\nA m�dia dos n�meros m�ltiplos de 3: "+media);
	} 
	
}

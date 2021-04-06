package lacorepeticao1; 
import java.util.Scanner; 
public class Questao3 { 
	
	public static void main(String[] args) {
		int idade, totalp21=0, totalp50=0; 
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\nInforme a idade: ");
		idade = leia.nextInt(); 
		
		while (idade != -99) { 
			if (idade < 21) {
				totalp21++; 
			}
			if (idade > 50) {
				totalp50++; 
			}
			System.out.println("\nInforme a idade: "); 
			idade = leia.nextInt(); 
		}
		System.out.println("\nQuantidade de pessoas com menos de 21 anos: "+totalp21);
		System.out.println("\nQuantidade de pessoas com mais de 50 anos: "+totalp50);
	}
}
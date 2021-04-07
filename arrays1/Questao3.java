package arrays1;
import java.util.Scanner; 
public class Questao3 {

	public static void main(String[] args) {
		int [ ] [ ] valor = new int [3][3]; 
		int  contv=0;
		String maior10 = "Total de valores maiores que 10:"; 
		
		Scanner leia = new Scanner(System.in); 
		for (int l=0; l<3; l++) { 
			for (int c=0; c<3; c++) {
				System.out.println("\nEntre com um valor: ");
				valor [l][c] = leia.nextInt(); 
			if (valor[l][c] >10)	{
				contv++; 
			}
			}
		}
			System.out.println("\n"+maior10+" "+contv);
					
	}
}

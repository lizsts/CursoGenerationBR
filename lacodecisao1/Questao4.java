package lacodecisao1; 
import java.util.Scanner;
public class Questao4 {
	
   public static void main(String[] args) {
   double numero, raiz, pot; 
	   
	   Scanner leia = new Scanner (System.in); 
	   
	   System.out.println("Insira um n�mero: ");
	   numero = leia.nextDouble(); 
	   
	   if (numero %2 == 0) {
		  raiz = Math.sqrt(numero); 
		 
		   System.out.printf("A ra�z quadrada de "+numero+" �: %.2f",raiz); 
	   } else if (numero %2!= 0) { 
		   pot = Math.pow(numero, 2); 
		   System.out.println("A pot�ncia ao quadrado de "+numero+" �: "+pot); }
	   
}
}
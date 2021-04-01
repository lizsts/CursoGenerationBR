package programacaosequencial1;
import java.util.Scanner;

public class Questao4 {
	
	public static void main(String[] args) {
	
		double  a, b, c, r, s, d; 
	
	    Scanner ler = new Scanner(System.in); 
	 
		    
		    System.out.println("Insira o valor de a: ");
			a = ler.nextInt();
			while(a<0) {
				System.out.println("\nValor inválido!!! Digite novamente valor a: ");
				a = ler.nextInt(); 
				}
			
			System.out.println("\nInsira o valor de b: "); 
			b = ler.nextInt(); 
			
			while(b<0) {
				System.out.println("\nValor inválido!!! Digite novamente valor b: "); 
				b = ler.nextInt();}
			
			
		  	System.out.println("\nInsira o valor de c: "); 
			c = ler.nextInt(); 
			
			while(c<0) {
				System.out.println("\nValor inválido!!! Digite novamente valor c: ");  
				c = ler.nextInt(); }
				
				
		   	r= Math.pow((a+b),2);
			s= Math.pow((b+c), 2);
			d = (r + s)/2;  
		
			
    		System.out.println("Resultado da expressão D = (R + S)/2 : "+d); 
    } 
}
	

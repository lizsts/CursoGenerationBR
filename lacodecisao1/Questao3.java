package lacodecisao1;
import java.util.Scanner;
public class Questao3 {
		
	  public static void main(String[] args) {
		  
		  int infantil, juvenil, adulto, idade; 
		  Scanner leia = new Scanner (System.in);
		
		  System.out.println("Digite sua idade: ");
		      idade = leia.nextInt();
		      
		  if (idade >=10 && idade <=14) { 
			  System.out.println("\nVocê está na categoria infantil.");
			  infantil = leia.nextInt(); 
		  } else if (idade >=15 && idade <=17) {
			  System.out.println("\nVocê está na categoria juvenil.");
			  juvenil = leia.nextInt(); 
		  } else if (idade >= 18 && idade<=25) {
			  System.out.println("\nVocê está na categoria adulto.");
			  adulto = leia.nextInt(); 
		  } else {
			  System.out.println("\nIdade não corresponde à faixa etária da competição!");
		  }
	  }
	}

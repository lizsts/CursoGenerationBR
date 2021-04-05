package exercicioferiado1;
import java.util.Scanner;
public class Questao7 {
  
	public static void main(String[] args) {
		
		int naulas; 
		float dinss, vhaula, salariol, salariob; 
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("\nDigite o valor da hora-aula:  ");
		vhaula = leia.nextFloat(); 
		System.out.println("\nDigite o número de aulas dadas: ");
		naulas = leia.nextInt(); 
		System.out.println("\nDigite o percentual de desconto do INSS: ");
		dinss = leia.nextFloat(); 
		
		salariob = naulas * vhaula; 
		salariol = salariob - (salariob * (dinss/100));
		
		
		System.out.printf("\nO salário líquido do professor é: R$%.2f",salariol);
		
	}
}

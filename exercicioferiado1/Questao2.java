package exercicioferiado1;
import java.util.Scanner; 
public class Questao2 {
	
	public static void main(String[] args) {
		int num; 
		
		Scanner leia = new Scanner(System.in); 
		
	
		System.out.println("Entre com um n�mero inteiro:  ");
		num = leia.nextInt(); 
		
		System.out.println("\nO sucessor do n�mero �: "+(num + 1));
		System.out.println("\nO antecessor do n�mero �: "+(num - 1));
	}

}

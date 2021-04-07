package arrays1;
public class Questao1 {
 
	public static void main(String[] args) {
		int  x=0, somap=0;  
		int [ ] vetorA = new int [6]; 
		
			vetorA[0] = 1; 
			vetorA[1] = 0; 
			vetorA[2] = 5; 
			vetorA[3] = -2; 
			vetorA[4] = -5; 
			vetorA[5] = 7; 
			somap = somap + (vetorA[0] + vetorA[1] + vetorA[5]); 

		System.out.println("\nA soma dos valores das posições 0, 1 e 5 é: "+somap);
		
		for (x=0; x < 6; x++) {
			
		System.out.println("\nO valor do vetorA ["+ (x)+"] é: "+vetorA[x]); 
		if (x==4) { 
			System.out.println("\nO valor do vetorA["+(x)+"] atualizado é 100.");
		}
		}
		}
					
		}


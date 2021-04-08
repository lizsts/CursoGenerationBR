package orientadoaobjetos1;

public class PacienteTeste {
     public static void main(String[] args) {
    	 Paciente infos = new Paciente("Nome: Luiza Almeida","Idade: 19 anos","Gênero: Mulher cisgênero","Raça/Etnia: Negra","Queixa principal: Crises de enxaqueca"); 
    	 

  System.out.println("\n # Ficha de paciente #");
 
  infos.imprimirDados();
  
     }    	
	
}


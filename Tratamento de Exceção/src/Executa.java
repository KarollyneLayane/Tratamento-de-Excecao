import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i == 0){
			
			try {
				
				double resultado;
				
				Scanner leia = new Scanner (System.in);
				Numero n = new Numero();
				
				System.out.println("Escreva o primeiro número: ");
			    n.num1 = leia.nextInt();
			    
			    System.out.println("Escreva o segundo número: ");
			    n.num2 = leia.nextInt();
			    
			    n.validaNumeros();
			    
			    resultado = n.dividir();
			    
			    System.out.println("O resultado da divisão é: " + resultado);
			    
			    i = 1;
			
			} catch(Exception e){
				
				System.out.println(e.getMessage());
			
			}
			
		}
		
		

	}
}

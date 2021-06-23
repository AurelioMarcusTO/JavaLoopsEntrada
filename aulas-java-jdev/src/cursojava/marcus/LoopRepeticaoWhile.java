package cursojava.marcus;

public class LoopRepeticaoWhile {
	
	public static void main(String[] args) {
		
		/*Estrutura de Repetição While*/
		
		int numero = 0;
		
		while (numero <= 10) { /*Verifica e executa*/ 
			
			System.out.println("O numero é :" + numero);
			numero ++;
			
		}
		
		int numero2 = 10;
		
		do {			/*Executa depois verifica*/
			System.out.println("O seg. numero é :" + numero2);
			numero2 --;
		} while (numero2 >= 0);
		
		
	}
	
}

package cursojava.marcus;

public class LooprRepeticaoForContinue {

	public static void main(String[] args) {

		for (int numero = 0; numero <= 10; numero++) {

			if (numero == 2 || numero == 5 || numero == 7) {

				System.out.println("Achei o numero : " + numero);
				continue;
			}
			
			System.out.println("Processando o laço de Repetição");

		}

	}

}

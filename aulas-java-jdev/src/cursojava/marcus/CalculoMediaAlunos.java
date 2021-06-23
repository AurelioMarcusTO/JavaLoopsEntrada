package cursojava.marcus;

import javax.swing.JOptionPane;

public class CalculoMediaAlunos {

	public static void main(String[] args) {

		String nota1 = JOptionPane.showInputDialog("Informe a nota 1 :");

		String nota2 = JOptionPane.showInputDialog("Informe a nota 2 :");

		String nota3 = JOptionPane.showInputDialog("Informe a nota 3 :");

		String nota4 = JOptionPane.showInputDialog("Informe a nota 4 :");

		double vnota1 = Double.parseDouble(nota1);

		double vnota2 = Double.parseDouble(nota2);

		double vnota3 = Double.parseDouble(nota3);

		double vnota4 = Double.parseDouble(nota4);

		double media = (vnota1 + vnota2 + vnota3 + vnota4) / 4;

		System.out.println("A média do aluno é :" + media);

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "O aluno esta Aprovado ! sua média é :" + media);
				
			} else {
				JOptionPane.showMessageDialog(null, "O aluno esta de Recuperação ! sua média é :" + media);
			}

		} else {
			JOptionPane.showMessageDialog(null, "O aluno esta Reprovado ! sua média é :" + media);
		}

	}

}

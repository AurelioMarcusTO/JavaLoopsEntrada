package cursojava.marcus;

import javax.swing.JOptionPane;

public class PrimeiraEntradaDeDados {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros :");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas :");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = (carroNumero % pessoaNumero);
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver a resposta da divisao ?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Cada pessoa terá : " + divisao + " carros");
		} else if (resposta == 1) {
			JOptionPane.showMessageDialog(null, "Tudo bem !!!");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisao ?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "O resto da divisao é : " + resto);
		}
		
	}

}

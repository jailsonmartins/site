package br.unip.lpe.parte1;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		int saFixo;
		int totalVendas;
		int saFinal;
		String funcionario;
		String receba;

		funcionario = JOptionPane.showInputDialog("Nome funcionario:");

		receba = JOptionPane.showInputDialog("Informe o salario fixo do funcionario:");
		saFixo = Integer.parseInt(receba);

		receba = JOptionPane.showInputDialog("Informe o valor total das vendas:");
		totalVendas = Integer.parseInt(receba);

		totalVendas = (int) (totalVendas * 0.15);
		saFinal = (saFixo + totalVendas);

		JOptionPane.showMessageDialog(null, "Funcionario: " + funcionario);
		JOptionPane.showMessageDialog(null, "Salario fixo e:" + saFixo);
		JOptionPane.showMessageDialog(null, "Salario com comissão e: "+ saFinal + " reais.");
		System.exit(0);

	}
}
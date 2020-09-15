package br.unip.lpe.parte1;

import javax.swing.JOptionPane;

public class Exercicio6 {

	public static void main(String[] args) {

		int A;
		int B;
		int Auxiliar;
		A = 5;
		B = 10;

		JOptionPane.showMessageDialog(null, "Antes da troca : \nA = " + A + " \nB = " + B);
		Auxiliar = A;
		A = B;
		B = Auxiliar;
		JOptionPane.showMessageDialog(null, "Depois da troca: \nA = " + A + " \nB = " + B);
	}

}
package br.unip.lpe.parte1;

import javax.swing.JOptionPane;

public class Exercicio2 {

	
	public static void main(String[] args) {
		int numero1;
		int numero2;
		int soma;
		int divisao;
		int multiplicacao;
		int subtracao;
		String receba;
		
		receba=JOptionPane.showInputDialog("Informe o numero 1:"); // Digitar o primeiro numero
		numero1 = Integer.parseInt(receba);
		
		receba=JOptionPane.showInputDialog("Informe o numero 2:"); // Digitar o segundo numero
		numero2 = Integer.parseInt(receba);
		
		//Soma /divis�o /multiplica��o /subtra��o
		soma = numero1 + numero2;
		divisao = numero1 / numero2;
		multiplicacao = numero1 * numero2;
		subtracao = numero1 - numero2;
		
		//resultado 
    	JOptionPane.showMessageDialog(null, "Soma "+ soma);
		JOptionPane.showMessageDialog(null, "Divis�o "+ divisao);
		JOptionPane.showMessageDialog(null, "Multiplica��o "+ multiplicacao);
		JOptionPane.showMessageDialog(null, "Subtra��o "+ subtracao);
		
		System.exit(0); //finaliza aplica��o

	}

}

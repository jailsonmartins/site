package br.unip.lpe.parte1;

import javax.swing.JOptionPane;

public class Exercicio7 {

	public static void main(String[] args) {
		
		int f;
		String receba;
		
		// variavel que recebe o valor da temperatura
		receba = JOptionPane.showInputDialog("Temperatura em graus Celsius: ");
		
		// Formula conversão em Fahrenheit
		int celsius = Integer.parseInt(receba);
		f = ((9*celsius)+160)/5;
		
		// Resultado convertido em Fahrenheit
	    JOptionPane.showMessageDialog(null,"A temperatura em Fahrenheit é "+f+".");
		
	}

}
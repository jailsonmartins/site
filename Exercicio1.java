package br.unip.lpe.parte1;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		// variaveis
		int numero1;
		int numero2;
		int resultado;
		String receba;
		
		// informar o primeiro numero
		receba=JOptionPane.showInputDialog("Informe o numero 1:");
		numero1 = Integer.parseInt(receba);
		
		// informar o segundo numero
		receba=JOptionPane.showInputDialog("Informe o numero 2:");
		numero2 = Integer.parseInt(receba);
		
		// soma dos dois numeros		
		resultado = numero1 + numero2;
		
		// resultado final dos dois numeros
		JOptionPane.showMessageDialog(null, "Soma: "+ resultado);
		
		//finaliza aplicação
		System.exit(0); 

	}

}

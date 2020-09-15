package br.unip.lpe.parte1;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
	
	// Variaveis
	int distancia;
	int litros;
	String receba;
	
	// Digitar a distancia percorrida
	receba=JOptionPane.showInputDialog("Informe a distancia percorrida:"); 
	distancia = Integer.parseInt(receba);
	
	// Digitar a quantidade de combustivel
	receba=JOptionPane.showInputDialog("Informe a quantidade de combustivel:"); 
	litros = Integer.parseInt(receba);
	
	// Resultado 
	JOptionPane.showMessageDialog(null, "Media " + distancia/litros +" Km por litro.");			
	
	//finaliza aplicação
	System.exit(0); 

	}

}

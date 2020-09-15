package br.unip.lpe.parte1;

import javax.swing.JOptionPane;

public class Exercicio5{
   public static void main(String args[])
   {
	  
	  float NP1;
	  float NP2;
	  float NP3;
	  float calc_media;
	  String nome;
	  
	  nome = JOptionPane.showInputDialog(null, "Informe o nome do aluno: ");
	  
      NP1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota NP1."));
      
      NP2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota NP2."));
      
      NP3 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota NP3."));
      calc_media = (NP1 + NP2 + NP3) / 3;
     
      JOptionPane.showMessageDialog(null,"A media final do aluno " + nome + " é " +calc_media);
   }
}

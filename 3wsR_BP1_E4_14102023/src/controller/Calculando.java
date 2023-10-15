package controller;

import javax.swing.JOptionPane;

public class Calculando {
	public void primeiro() {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
		int C = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));

		int D = (-A + B * C);
		System.out.println("Resultado da Opção 1 é: " + D);
	}

	public void segundo() {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
		int C = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));

		int D = ((A + B) % C);
		System.out.println("Resultado da Opção 1 é: " + D);
	}

	public void terceiro() {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
		int C = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));
		int D = Integer.parseInt(JOptionPane.showInputDialog("Valor de D: "));
		
		int E = A + -B * C / D;
		System.out.println("Resultado da Opção 1 é: " + E);
	}

	public void quarto() {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
		int C = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));
		int D = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));
		int E = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));
		int F = Integer.parseInt(JOptionPane.showInputDialog("Valor de C: "));

		int G = (A+B/C*D-E%F);
		System.out.println("Resultado da Opção 1 é: " + G);
	}

}

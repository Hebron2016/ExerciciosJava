package view;

import javax.swing.JOptionPane;

public class Division_Casting {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
		int C = (int) (A/B);
		System.out.println("Divisão de A e B com Casting para inteiro é igual a: "+C);
	}

}

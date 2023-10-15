package view;

import javax.swing.JOptionPane;

public class Sum_JOptionPane {

	public static void main(String[] args) {
		int A = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
		int B = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
		System.out.println("A soma é : "+(A+B));
	}

}

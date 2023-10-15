package view;

import javax.swing.JOptionPane;

public class Multiplicando {

	public static void main(String[] args) {
		int OPC = 0;
		while (OPC != 9) {
			OPC = Integer.parseInt(JOptionPane.showInputDialog("Opção 1 Multiplica\nOpção 9 Finaliza"));
			switch (OPC) {
			case 1:
				System.out.println("Você escolheu a opção 1");
				int A = Integer.parseInt(JOptionPane.showInputDialog("Valor de A: "));
				int B = Integer.parseInt(JOptionPane.showInputDialog("Valor de B: "));
				System.out.println("A vezes B é igual a: " + A * B);
				break;
			case 9:
				System.out.println("Acabou");
				break;
			default:
				System.out.println("Não existe essa opção");
			}
		}
	}
}

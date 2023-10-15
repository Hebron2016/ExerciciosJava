package view;

import javax.swing.JOptionPane;

import controller.Calculando;

public class multiContas_JOptionPane {

	public static void main(String[] args) {
		Calculando calc = new Calculando();
		int OPC = 0;
		while (OPC != 9) {
			OPC = Integer.parseInt(JOptionPane.showInputDialog("Opção 1 (-A + B*C)\nOpção 2 ((A+B) % C) \nOpção 3 (A+-B*C/D)"
							+ "\nOpção 4 A+B/C*D-E%F\n Opção 9 FINALIZA"));
			switch (OPC) {
			case 1:
				System.out.println("Você escolheu a opção 1");
				calc.primeiro();
				break;
			case 2:
				System.out.println("Você escolheu a opção 2");
				calc.segundo();
				break;
			case 3:
				System.out.println("Você escolheu a opção 3");
				calc.terceiro();
				break;
			case 4:
				System.out.println("Você escolheu a opção 4");
				calc.quarto();
				break;
			case 9:
				System.out.println("fim");
				break;
			default:
				System.out.println("Não existe essa opção");
			}
		}
	}
}

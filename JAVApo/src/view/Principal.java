package view;

import controller.Maquina;

public class Principal {

	public static void main(String[] args) {
		int p2 = 0;
		int p1 = 0;
		Maquina Inicia = new Maquina();
		p1 = Inicia.player1(p1);
		p2 = Inicia.player2(p2);
		Inicia.resultado(p1,p2);
		System.out.println("Resultado"+p1 +p2);
	}

}

package view;

import controller.Maquina;

public class Principal {

	public static void main(String[] args) {
		Maquina Inicia = new Maquina();
//		Inicia.player1();
//		Inicia.player2();
		Inicia.resultado(Inicia.player1(),Inicia.player2());
	}

}

package controller;

import javax.swing.JOptionPane;

public class Maquina {
	ArmazenaDesenho Carrega = new ArmazenaDesenho();
	public int player1 (int p1) {
		int aux = 0; 
		while(aux !=9) {
			 p1 = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1.Pedra\n2.Papel\n3.Tesoura"));
			switch(p1) {
			case 1:
				Carrega.pedra();
				aux=9;
			break;
			case 2:
				Carrega.papel();
				aux=9;
			break;
			
			case 3:
				Carrega.tesoura();
				aux=9;
			break;
			default:
				JOptionPane.showConfirmDialog(null, "Essa Op��o n�o existe");
			}
		}
		return p1;
		 
	}
	public int player2(int p2) {
			p2 = (int) ((Math.random()+1)*2);
			System.out.println("p2 é igual a == "+p2);
			if(p2 == 1) {
				Carrega.pedra();
			}
			if(p2 == 2) {
				Carrega.papel();
			}
			if(p2 == 3) {
				Carrega.tesoura();
			}
		
		return p2;
	}

	
	public void resultado(int p1 ,int p2) {
		System.out.println("Tá dando ruim aqui meu nobre");
		if (p1 == p2) {
			System.out.println("EMPATE");
		}else {
			if ((p1 == 1) && (p2 == 2)) {
				System.out.println("PERDEU");
			}
			if ((p1 == 2) && (p2 == 3)) {
				System.out.println("PERDEU");
			}
			if ((p1 == 3) && (p2 == 1)) {
				System.out.println("PERDEU");
			}
			if ((p1 == 1) && (p2 == 3)) {
				System.out.println("VENCEU");
			}
			if ((p1 == 2) && (p2 == 1)) {
				System.out.println("VENCEU");
			}
			if ((p1 == 3) && (p2 == 2)) {
				System.out.println("VENCEU");
			}
		}
	}
	
}

package controller;

import javax.swing.JOptionPane;

public class Maquina {
	int i = 0;
	ArmazenaDesenho Carrega = new ArmazenaDesenho();
	public int player1 () {
		int p1 =0;
		while(p1 !=9) {
			 p1 = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n1.Pedra\n2.Papel\n3.Tesoura"));
			switch(p1) {
			case 1:
				Carrega.pedra(p1);
			break;
			case 2:
				Carrega.papel(p1);
			break;
			
			case 3:
				Carrega.tesoura(p1);
			break;
			default:
				JOptionPane.showConfirmDialog(null, "Essa Opção não existe");

			}
		}
		return p1;
		 
	}
	public int player2() {
			int p2 = 0;
			p2 = (int) (Math.random()*4);
			switch(p2) {
			case 1:
				Carrega.pedra(p2);
			break;
			case 2:
				Carrega.papel(p2);
			break;
			
			case 3:
				Carrega.tesoura(p2);
			break;
		}
			return p2;
	}

	
	public void resultado(int p1 ,int p2) {
		if (p1 == p2) {
			JOptionPane.showConfirmDialog(null, "EMPATE");
		}else {
			if ((p1 == 1) && (p2 == 2)) {
				JOptionPane.showConfirmDialog(null, "PERDEU");
			}
			if ((p1 == 2) && (p2 == 3)) {
				JOptionPane.showConfirmDialog(null, "PERDEU");
			}
			if ((p1 == 3) && (p2 == 1)) {
				JOptionPane.showConfirmDialog(null, "PERDEU");
			}
			if ((p1 == 1) && (p2 == 3)) {
				JOptionPane.showConfirmDialog(null, "VENCEU");
			}
			if ((p1 == 2) && (p2 == 1)) {
				JOptionPane.showConfirmDialog(null, "VENCEU");
			}
			if ((p1 == 3) && (p2 == 2)) {
				JOptionPane.showConfirmDialog(null, "VENCEU");
			}
		}
	}
	
}

package controller;

public class ArmazenaDesenho {
	String[] pedra = new String[4];
	String[] tesoura = new String[5];
	String[] papel = new String[7];
	
	public void pedra (int a) {
		pedra[0] = "    ____\n" ;
		pedra[1] = "  _/  _ \\n " ;
		pedra[2] = " / _ - _ \\\n" ;
		pedra[3] = " \\_______/  \n " ;
		for(int i =0; i<pedra.length;i++) {
			System.out.println(pedra[i]);
		}
		return;
	}
	public void papel(int a) {
		papel[0] = "   _____ \n";
		papel[1] = "  O_____O \n";
		papel[2] = "  /     / \n";
		papel[3] = " /____ / \n";
		papel[4] = "O_____O \n";
		for(int i =0; i<papel.length;i++) {
			System.out.println(tesoura[i]);
		}
	}
	public void tesoura(int a) {
		tesoura[0] = "    _    _\n";
		tesoura[1] = "   (_)  / )\n";
		tesoura[2] = "     | (_/ \n";
		tesoura[3] = "    _+/ \n";
		tesoura[4] = "   //|\\ \n";
		tesoura[5] = "  // || \n";
		tesoura[6] = " (/  |/ \\n";
		for(int i =0; i<tesoura.length;i++) {
			System.out.println(tesoura[i]);
		}
	}
}

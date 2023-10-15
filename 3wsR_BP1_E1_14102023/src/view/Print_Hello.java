package view;
import javax.swing.JOptionPane;
public class Print_Hello {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Escreva seu nome: ");
		System.out.println("HELLO "+name);
	}

}

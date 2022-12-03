package fundamentos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class DesafioCalculadora {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		JFrame frame = new JFrame("Escolha sua resposta");
		int resposta = JOptionPane.showConfirmDialog(frame, JOptionPane.YES_NO_OPTION);
		
	}
}

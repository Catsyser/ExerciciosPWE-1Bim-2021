import java.util.Scanner;

import javax.swing.JOptionPane;

public class QuadradECub1143 {

	public static void main(String[] args) {
		int n = 0;
		int quadrado = 0;
		int cubo = 0; 
		String saida = "";
		
		Scanner s = new Scanner(System.in);

		n = s.nextInt();
		
		if(n > 1 && n < 1000) {
			
			for(int i = 1; i <= n; i++) {
				saida += i + " " + Math.pow(i, 2) + " " + Math.pow(i, 3) + "\n";
			}
			System.out.println(saida);
			JOptionPane.showMessageDialog(null, saida);
		} else {
			System.exit(0);
		}
	}

}
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SumImpConsec1071 {

	public static void main(String[] args) {
		// Lista de exercício - exercício 1
		
		// Deixar o x sempre como o menor e o y sempre como maior
		
		int x, y, guar = 0, soma = 0;
		
		Scanner s = new Scanner (System.in);
		
		x = s.nextInt();
		
		y = s.nextInt();
		
		if(x > y) {
			guar = x;
			x = y;
			y = guar;
		}
		
		// Laço de repetição for
		
		for(int i = x + 1; i < y; i++) {
			if(i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		JOptionPane.showMessageDialog(null, soma);
	}

}
import java.util.Scanner;

import javax.swing.JOptionPane;

public class SeqESum1101 {

	public static void main(String[] args) {
		// Lista de exercícios - exercício 2
		
		// Organizar o maior e o menor - n = menor e m = maior
		int n = 0, m = 0, guar = 0, soma = 0;
		
		do {
		String seq = "";
		
		Scanner s = new Scanner(System.in);
		
		n = s.nextInt();
		m = s.nextInt();
		
		if(n > 0 && m > 0) {

			if(n > m ) {
				guar = n;
				n = m;
				m = guar;
			}
		
			for(int i = n; i <= m; i++) {
				seq += " " + i;
				soma += i;
			}
			
			System.out.println(seq + " Sum=" + soma);
			seq = "";
			soma = 0;
			guar = 0;
		}
		} while(n > 0 && m > 0);
		}
	}
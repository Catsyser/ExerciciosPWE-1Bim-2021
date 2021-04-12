import java.util.Scanner;

import javax.swing.JOptionPane;

public class NumPrimo1165 {

	public static void main(String[] args) {
		int vezes = 0, turno = 0, num = 0, primo = 0;
		String resp = "";
		
		Scanner s = new Scanner(System.in);
		vezes = s.nextInt();
		
		if(vezes >= 1 && vezes <= 100) {

			while(turno < vezes) {
				num = s.nextInt();
					
				if(num > 1 && num < Math.pow(10, 7)) {
					for(int i = 1; i <= num; i++) {
						if(num % i == 0) {
						primo++;
						}
					}
					if(primo == 2) {
						resp += num + " eh primo \n";
						primo = 0;
					} else {
						resp += num + " nao eh primo \n";
						primo = 0;
					}
					turno++;
				} else {
					System.exit(0);
				}
			}
			System.out.println(resp);
			JOptionPane.showMessageDialog(null, resp);
		} else {
			System.exit(0);
		}
	}
}
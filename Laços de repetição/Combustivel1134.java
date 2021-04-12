import java.util.Scanner;

import javax.swing.JOptionPane;

public class Combustivel1134 {

	public static void main(String[] args) {
		int cod = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		Scanner s = new Scanner(System.in);
		
		while(cod != 4) {
			
			cod = s.nextInt();
			
			if(cod == 1){
				alcool++;
			} else if(cod == 2) {
				gasolina++;
			} else if(cod == 3) {
				diesel++;
			}
		}
		
		System.out.println("MUITO OBRIGADO \n" + "Alcool: " + alcool + "\n" + "Gasolina: " + gasolina + "\n" + "Diesel: " + diesel);
		JOptionPane.showMessageDialog(null, "MUITO OBRIGADO \n" + "Alcool: " + alcool + "\n" + "Gasolina: " + gasolina + "\n" + "Diesel: " + diesel);
	}

}
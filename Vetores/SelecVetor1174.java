import java.util.Scanner;

import javax.swing.JOptionPane;

public class SelecVetor1174 {

	public static void main(String[] args) {
		   
        double array[] = new double [100];
        Scanner s = new Scanner(System.in);
        
        for(int i=0; i<array.length; i++) {
            array[i] = s.nextDouble();
        }
        
        for(int z=0; z<array.length; z++) {
            if(array[z]<=10) 
            {
                System.out.println("A ["+z+"] = " + array[z]);
            }
        }
	}
}
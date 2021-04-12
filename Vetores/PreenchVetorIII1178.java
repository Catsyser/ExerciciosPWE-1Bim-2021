import java.util.Scanner;

public class PreenchVetorIII1178 {

	public static void main(String[] args) {

        double n[] = new double [100];
        String result="";
        
        Scanner s = new Scanner(System.in);
        n[0] = s.nextDouble();
                
        for(int i=1; i<n.length; i++) {
                n[i]= n[i-1]/2;
        }
        
        for(int z=0; z<n.length; z++) {
            result= String.format("%.4f", n[z]);
            System.out.println("c["+z+"] = "+result);
        }
	}

}

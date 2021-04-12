import java.util.Scanner;

public class TrocaVet1175 {

	public static void main(String[] args) {
		  
        int n[] = new int [20];
        int gua, posi=1;
        
        Scanner s = new Scanner(System.in);
        
        for(int i=0; i<n.length; i++) {
            n[i]= s.nextInt();
        }
        
        for(int z=0; z<n.length/2; z++) {
            
                 gua = n[z];
                 n[z] = n[n.length-posi];
//               n[z] = n[(n.length - 1) - z];
                 n[n.length-posi]= gua;
            
            posi++;
        }
        
        for(int t=0; t<n.length;t++) {
            System.out.println("n["+t+"] = "+n[t]);
        }
	}

}
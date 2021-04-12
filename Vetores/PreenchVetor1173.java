import java.util.Scanner;

public class PreenchVetor1173 {

	public static void main(String[] args) {
		int n[] = new int [10];
        int v = 0;
        
        Scanner s = new Scanner(System.in);
        v = s.nextInt();

        if(v<=50) {
            for(int i=0; i<n.length; i++) {
                n[0]=v;
                if(i!=0) {
                    n[i] = n[i-1]*2;
                }
            }
            
            for(int z=0; z<n.length; z++) {
                System.out.println("N["+z+"] = "+n[z]);
            }
        }
	}

}

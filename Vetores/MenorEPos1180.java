import java.util.Scanner;

public class MenorEPos1180 {

	public static void main(String[] args) {

        int n, menor=0, posi=0;
        int x[];
        
        Scanner s = new Scanner(System.in);
        
        n= s.nextInt();
        
        x= new int [n];
        
        for(int i=0; i<x.length; i++) {
            x[i]= s.nextInt();
        }
        
        for(int z=0; z<x.length; z++) {
            if(z==0) {
            menor=x[z];
            }
            
            if(x[z]<menor) {
                menor=x[z];
                posi=z;
            }
        }
        
        System.out.println("Menor Valor: "+menor+"\n"+"Posicao: "+posi);
	}

}

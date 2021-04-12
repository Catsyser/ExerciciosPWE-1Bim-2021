import java.util.Scanner;

public class ExercAulaVetor01 {

	public static void main(String[] args) {
		int arrayEx[] = new int[10];
		int input = 0, menor = 0, maior = 0, guar = 0, posima = 0, posime = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < arrayEx.length; i++) {
			arrayEx[i] = s.nextInt();
		}
		
		 for(int i=0; i<arrayEx.length; i++) 
	        {
	            if(i==0) {
	                maior=arrayEx[0];
	                menor=arrayEx[0];
	            }

	            if(arrayEx[i]>maior) 
	            {
	                maior=arrayEx[i];
	                posima =i;
	            }
	            if(arrayEx[i]<menor) 
	            {
	                menor=arrayEx[i];
	                posime =i;
	            }
	        }
		
		 for(int y = 0; y < arrayEx.length; y++) {
			for(int i = 0; i < arrayEx.length; i++) {
				if(i != 0) {
					if(arrayEx[i] < arrayEx[i - 1]) {
						guar = arrayEx[i];
						arrayEx[i] = arrayEx[i - 1];
						arrayEx[i-1] = guar;
					}
				}
			}
		}
		 
		 System.out.println("Maior: " + maior + " na posicao: " + posima + "\nMenor: " + menor + " na posicao: " + posime);
		 for(int i = 0; i < arrayEx.length; i++) {
				System.out.println(arrayEx[i]);
			}
	}

}

package pesquisaBináriaeSequencial;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class PareseImpares {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int nmrCasos,entrada;
		int incrementa = 0,incrementa2 = 0;
		nmrCasos = sc.nextInt();
		int vet[] = new int[nmrCasos];
		int vet2[] = new int[nmrCasos/2];

		for(int i=0;i<vet.length;i++) {
			entrada = sc.nextInt();
			if(entrada%2==0) {
				vet[incrementa] = entrada;
				incrementa++;
			}else{
				vet2[incrementa2] = entrada;
				incrementa2++;
			}
			}	
	        Arrays.sort(vet);
	        bubbleSort(vet2);
	        printVetor(vet);
	        printVetor(vet2);
		
    }
	
	public static void bubbleSort(int[] vet) {
		for (int i = 1; i < vet.length; i++) {
		    for (int j = 0; j < i; j++) {
		        if (vet[i] > vet[j]) {
		            int temp = vet[i];
		            vet[i] = vet[j];
		            vet[j] = temp;
		        }
		    }
		}
	}
	
	
	
	public static void printVetor(int[]vet) {
		for(int x=0;x<vet.length;x++) {
			if(vet[x]!=0) {
			System.out.println(vet[x]);
			}
	}
}
}

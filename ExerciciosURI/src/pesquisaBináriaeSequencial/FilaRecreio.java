package pesquisaBináriaeSequencial;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FilaRecreio {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int casosTeste;
		int vet[];
		int vet2[];
		casosTeste = sc.nextInt();
		for(int i =0;i<casosTeste;i++) {
			int num = sc.nextInt();
			vet = new int[num];
			vet2 = new int[num];
			for(int x=0;x<num;x++) {
				int entrada = sc.nextInt();
				vet[x]=entrada;
				vet2[x]=entrada;
			}
			bubbleSort(vet);
			System.out.println(IndicaAlunos(vet,vet2));
		}
		

	}
	
	public static int IndicaAlunos(int[] vet, int[] vet2) {
		int count =0;
		for (int i =0;i<vet.length;i++) {
			if(vet[i]==vet2[i]) {
				count++;
			}
		}
		return count;
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
}

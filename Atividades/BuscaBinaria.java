package atividades;
import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int vet[] = { 1, 5, 3, 9, 7, 4, 6,8,10,200 };
		Arrays.sort(vet);
		int inicio = 0, fim = vet.length;
		int procurado = sc.nextInt();
		System.out.println(busca(vet,inicio, fim, procurado));

	}
	
	public static int busca(int[] vet, int inicio,int fim,int procurado) {
		int meio = (inicio + fim) / 2;
			if(inicio>fim) {
				return -1;
			}else if (procurado== vet[meio]) {
				return vet[meio];
			} else if (procurado < vet[meio]) {
				return busca(vet, inicio,meio-1, procurado); 
			} else {
				return busca(vet, meio+1,fim, procurado); 
			}
		
	}
}

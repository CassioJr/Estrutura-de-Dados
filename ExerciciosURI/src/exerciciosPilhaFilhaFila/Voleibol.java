package exerciciosPilhaFilhaFila;

import java.util.Scanner;

public class Voleibol {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		String name;
		n =sc.nextInt();
		double  bloqueios,saques,ataques;
		int[] dados = new int[6];
		
		for(int i = 0;i<n;i++) {
			name = sc.next();
		
			for (int j = 0; j < 6; j++) {
				dados[j] += sc.nextInt();
			}
		
		}
		
		bloqueios = (dados[3] * 100.0) / dados[0];
		saques = (dados[4] * 100.0)   / dados[1];
		ataques = (dados[5] * 100.0) / dados[2];
		System.out.println(String.format("Pontos de Saque: %.2f", bloqueios) + " %.");
		System.out.println(String.format("Pontos de Bloqueio: %.2f", saques) + " %.");
		System.out.println(String.format("Pontos de Ataque: %.2f", ataques) + " %.");
	
	}
}

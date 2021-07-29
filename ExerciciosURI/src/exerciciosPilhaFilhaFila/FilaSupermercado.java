package exerciciosPilhaFilhaFila;

import java.util.Scanner;

public class FilaSupermercado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, t,z,tempo;

		n = sc.nextInt();
		m = sc.nextInt();
		int[] vet1 = new int[n];
		int[] vet2 = new int[m];
		for (int i = 0; i < n; i++)
			vet1[i] = sc.nextInt();

		for (int i = 0; i < m; i++)
			vet2[i] = sc.nextInt();

		int[] temp = new int[n];
		t = 0;
		while (t < m) {
			if (t < n) {
				temp[t] = vet2[t] * vet1[t];
				t++;
			} else {
				tempo = temp[0];
				z = 0;
				for (int i = 0; i < n; i++)
					if (tempo > temp[i]) {
						tempo = temp[i];
						z = i;
					}
				temp[z] += vet2[t] * vet1[z];
				z = 0;
				t++;
			}
		}
		 tempo = temp[0];
		for (int i = 0; i < n; i++)
			if (tempo < temp[i])
				tempo = temp[i];
		System.out.println(tempo);

	}

}
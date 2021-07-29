package exerciciosPilhaFilhaFila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		  Queue<Integer> fila = new LinkedList<>();
		int n,m;
		int sairam,entraram,i;
		n= sc.nextInt();
		for(i =0;i<n;i++) {
			entraram = sc.nextInt();
			fila.add(entraram);
		}
		m= sc.nextInt();
		for(i=0;i<m;i++) {
			sairam = sc.nextInt();	
			if(fila.contains(sairam)) {
					fila.remove(sairam);	
			}

		}
		System.out.println(fila.toString().replaceAll("[\\[\\],]",""));
		
	}
	
}

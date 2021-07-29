package atividades;
import java.util.Scanner;

public class Temperatura {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int temperatura[] = {10,32,20,49,20,15,9,2,1,0};
	int procura = sc.nextInt();
	for(int i =0; i<temperatura.length;i++) {
		if(procura == temperatura[i]) {
			System.out.println("Temperatura: "+ temperatura[i]+ "\nNo dia: "+(i+1));
		}
	}
	}
}

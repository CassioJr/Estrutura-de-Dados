package exerciciosPilhaFilhaFila;

import java.io.IOException;
import java.util.Scanner;

public class BalancoParenteses {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String n;
		while(sc.hasNext()) {
		int ativo = 1;
		n = sc.nextLine();
		n = n.replaceAll("[^(e)]", "");

		while (ativo == 1) {
			if (n.indexOf("()") != -1) {
				n = n.replaceFirst("\\(\\)", "");
			} else {
				ativo = 0;
			}
		}
		if (n.indexOf("(") != -1 || n.indexOf(")") != -1) {
			System.out.println("incorrect");
		} else {
			System.out.println("correct");
		}
		
		}
		sc.close();
	}
}

import java.util.Scanner;
public class ContadorMain{
	public static void main(String args[]) {
		int n, op;
		ContadorOperacoes contadorop = new ContadorOperacoes();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		contadorop.inicializar(n);
		do {
		System.out.println("1 - Incrementar");
		System.out.println("2 - Decrementar");
		System.out.println("0 - Sair");
		op = sc.nextInt();
		switch(op) {
		case 1:
			contadorop.incrementar();
			System.out.println(contadorop.acessar());
			
			break;
			
		case 2:
			contadorop.decrementar();
			System.out.println(contadorop.acessar());
			break;
		}
		}while(op!=0);
	}
}
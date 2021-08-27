package teste;
import java.util.Scanner;

public class FatorialRecursao {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int f;
	f = sc.nextInt();
	System.out.println(fatorial(f));
}
	public static long fatorial( int n) {
		if(n==0) {
			return 1;
		}else {
			return n* fatorial(n-1);
		}
	
}
}
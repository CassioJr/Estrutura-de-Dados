package Exercicio7;
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Exercicio4.Main" para que a sua solução execute
 *      Class name must be "Exercicio4.Main" for your solution to execute
 *      El nombre de la clase debe ser "Exercicio4.Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
  Scanner sc= new Scanner(System.in);
   int n,t;
   long Fib[] = new long [61];

    for(int i =2;i<61;i++){
        Fib[i] = i;
    }
        Fib[0]=0;
        Fib[1]=1;
        Fib[2]=1;
        Fib[3]=2;
        Fib[4]=3;
        for(int i =6;i<61;i++) {
            Fib[i] = Fib[i - 1] + Fib[i-2];
        }

        t = sc.nextInt();
        for(int i = 0; i<t;i++){
            n = sc.nextInt();
        System.out.println("Fib("+n+")"+" = "+ Fib[n]);
        }
    }

}
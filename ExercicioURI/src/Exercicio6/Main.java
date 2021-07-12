package Exercicio6;
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
        int n, conta;
    Scanner sc = new Scanner(System.in);
       n= sc.nextInt();
        for(int i = 0; i <10;i++){
            System.out.println("N[" + i +"]"+ " = " + n );
            n= n*2;
        }

    }

}
package Exercicio6;
import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
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
package Exercicio2;
import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Main {

    public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
        int a,b,c,MaiorAB,Maior;

        a= sc.nextInt();
        b =sc.nextInt();
        c= sc.nextInt();
        MaiorAB = (a+b+Math.abs(a-b))/2;
        Maior = (MaiorAB+c+Math.abs(MaiorAB-c))/2;
        System.out.println(Maior+" eh o maior");
    }

}
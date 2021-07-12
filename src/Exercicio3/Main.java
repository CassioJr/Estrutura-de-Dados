package Exercicio3;
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
        Scanner sc = new Scanner(System.in);
        float  n1, n2;
        float resultado;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        resultado = (n1/12)*n2;

        System.out.printf("%.3f\n", resultado);

    }

}
package Exercicio3;
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
        Scanner sc = new Scanner(System.in);
        float  n1, n2;
        float resultado;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        resultado = (n1/12)*n2;

        System.out.printf("%.3f\n", resultado);

    }

}
package Exercicio8;
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
        int n, num, menor,posicao = 0;
        n = sc.nextInt();
        int vetor[] = new int[n];

        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            vetor[i] = num;
        }
        menor = vetor[0];
        for (int x = 1; x < n; x++) {
            if (vetor[x] < menor) {
                menor = vetor[x];
                posicao = x;
            }

        }
        System.out.println("Menor valor: "+ menor +"\n"+ "Posicao: "+ posicao);
             }

    }
package Exercicio5;
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
        double n1,n2,n3,n4,notaRp;
        float media,mediaRp;

            n1= sc.nextFloat();
            n2 = sc.nextFloat();
            n3 = sc.nextFloat();
            n4 = sc.nextFloat();

            n1 = n1* 0.2;
            n2 = n2* 0.3;
            n3 = n3* 0.4;
            n4 = n4* 0.1;
            media = (float) ((n1+n2)+(n3+n4));
            System.out.printf("Media: %.1f\n",media);
            if (media>= 7.0){
                System.out.println("Aluno aprovado.");
            }else if(media < 5.0){
                System.out.println("Aluno reprovado.");
            }else if(media >= 5.0 && media <= 6.9){
                notaRp = sc.nextFloat();
                mediaRp = (float) ((media + notaRp)/2);
                if(mediaRp>=5.0){
                    System.out.println("Aluno em exame.");
                    System.out.printf("Nota do exame: %.1f\n", notaRp);
                    System.out.println("Aluno aprovado.");
                    System.out.printf("Media final: %.1f\n",mediaRp);
                }else if(mediaRp<=4.9){
                    System.out.println("Aluno em exame.");
                    System.out.printf("Nota do exame: %.1f\n", notaRp);
                    System.out.println("Aluno reprovado.");
                    System.out.printf("Media final: %.1f\n",mediaRp);
                }
            }
    }

}
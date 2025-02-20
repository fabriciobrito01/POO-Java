import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o primeiro numero: ");
        int a = teclado.nextInt();
        System.out.print("Escreva o segundo numero: ");
        int b = teclado.nextInt();

        int soma = a + b;
        System.out.printf("O resultado da soma de %d e %d eh %d \n", a, b, soma);

        int subtracao = a - b;
        System.out.printf("O resultado da subtracao de %d e %d eh %d \n", a, b, subtracao);

        int multiplicacao = a * b;
        System.out.printf("O resultado da multiplicacao de %d e %d eh %d \n", a, b, multiplicacao);

        int divisao = a / b;
        System.out.printf("O resultado da divisao de %d e %d eh %d \n", a, b, divisao);

    }
}
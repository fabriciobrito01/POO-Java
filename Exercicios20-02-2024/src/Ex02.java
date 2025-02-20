import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o primeiro numero: ");
        float a = teclado.nextFloat();
        System.out.print("Escreva o segundo numero: ");
        float b = teclado.nextFloat();

        float soma = a + b;
        System.out.printf("O resultado da soma de %.2f e %.2f eh %.2f \n", a, b, soma);

        float subtracao = a - b;
        System.out.printf("O resultado da subtracao de %.2f e %.2f eh %.2f \n", a, b, subtracao);

        float multiplicacao = a * b;
        System.out.printf("O resultado da multiplicacao de %.2f e %.2f eh %.2f \n", a, b, multiplicacao);

        float divisao = a / b;
        System.out.printf("O resultado da divisao de %.2f e %.2f eh %.2f \n", a, b, divisao);

    }
}
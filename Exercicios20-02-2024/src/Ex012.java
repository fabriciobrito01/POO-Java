import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int a = teclado.nextInt();

        System.out.print("Digite outro número: ");
        int b = teclado.nextInt();

        int inicio = Math.min(a, b);
        int fim = Math.max(a, b);

        System.out.println("Números pares no intervalo: ");
        for (int i = inicio; i <= fim; i++){
            if (i % 2 == 0)
                System.out.println(i);
        }

        int soma = a + b;
        double media = soma / 2.0;

        System.out.printf("A soma de %d e %d é %d\nA média é igual a %.2f", a, b, soma, media);
    }
}

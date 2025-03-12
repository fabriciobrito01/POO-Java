import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um operador aritmético: ");
        char op = teclado.next().charAt(0);

        if (op == '+' || op == '-' || op == '*' || op == '/') {
            System.out.print("Número A: ");
            double a = teclado.nextDouble();

            System.out.print("Número B: ");
            double b = teclado.nextDouble();

            if (op == '+')
                System.out.printf("%.2f %c %.2f = %.2f", a, op, b, a + b);
            if (op == '-')
                System.out.printf("%.2f %c %.2f = %.2f", a, op, b, a - b);
            if (op == '*')
                System.out.printf("%.2f %c %.2f = %.2f", a, op, b, a * b);
            if (op == '/')
                System.out.printf("%.2f %c %.2f = %.2f", a, op, b, a / b);
        }
            else
                System.out.print("Operador inválido.");

    }
}

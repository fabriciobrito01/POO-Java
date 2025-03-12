import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o raio de um círculo: ");
        int r = teclado.nextInt();

        double per = 2 * Math.PI * r;
        double area = Math.PI * (r * r);

        System.out.printf("Um círculo com raio %d tem perímetro igual %.2f e área igual a %.2f\n", r, per, area);
    }
}

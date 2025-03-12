import java.util.Scanner;

public class Ex09 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double x = teclado.nextDouble();

        double parteDecimal = x - (int)x;

        int arredondado;
        if (parteDecimal >= 0.5)
            arredondado = (int) x +1;
        else
            arredondado = (int) x;

        System.out.println("O número arredondado é: " + arredondado);
    }
}

import java.util.Scanner;

public class Ex08 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de kilowatts consumidos: ");
        double kw = teclado.nextDouble();

        System.out.print("Digite o valor do kilowatt: ");
        double kwVal = teclado.nextDouble();

        double finalVal = kw * kwVal;
        double finalValDesc = finalVal - (finalVal*0.1);

        if (kw >= 150)
            System.out.printf("Valor a ser pago: R$%.2f", finalVal);
        else
            System.out.printf("Valor a ser pago: R$%.2f", finalValDesc);
    }
}

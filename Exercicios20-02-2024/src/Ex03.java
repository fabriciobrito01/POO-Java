import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        float salario = teclado.nextFloat();
        System.out.print("Digite o aumento: ");
        float aumentoPercentual = teclado.nextFloat();

        float aumentoSalario = salario * aumentoPercentual;
        float salarioFinal = salario + aumentoSalario;
        System.out.printf("O novo salario eh %.2f", salarioFinal);
    }
}

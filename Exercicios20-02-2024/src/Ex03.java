import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o salario: ");
        float salario = teclado.nextFloat();
        System.out.print("Digite o aumento: ");
        float aumento = teclado.nextFloat();

        float aumento_salario = salario * aumento;
        float salario_final = salario + aumento_salario;
        System.out.printf("O novo salario eh %.2f", salario_final);
    }
}

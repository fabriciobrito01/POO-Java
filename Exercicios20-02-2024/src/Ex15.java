import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int contadorVogais = 0;
        int contadorDigitos = 0;
        int contadorOutros = 0;

        while (true) {
            System.out.print("Digite um caractere (ou '.' para encerrar): ");
            String entrada = teclado.next();

            if (entrada.equals(".")) {
                break;
            }

            char caractere = entrada.charAt(0);

            if ("aeiouAEIOU".indexOf(caractere) != -1) {
                contadorVogais++;
            }
            else if (Character.isDigit(caractere)) {
                contadorDigitos++;
            }
            else {
                contadorOutros++;
            }
        }

        System.out.println("Quantidade de vogais: " + contadorVogais);
        System.out.println("Quantidade de dígitos: " + contadorDigitos);
        System.out.println("Quantidade de outros caracteres: " + contadorOutros);
    }
}

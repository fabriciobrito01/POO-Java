import java.util.Scanner;

public class Ex06 {
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos km o carro percorreu? ");
        double distancia = teclado.nextDouble();

        System.out.print("Em quantas horas o carro percorreu essa distancia? ");
        double tempo = teclado.nextDouble();

        System.out.print("Quantos litros de combustível o carro consumil? ");
        double combustivel = teclado.nextDouble();

        double velocidadeMedia = distancia / tempo;
        double consumoCombustivel = distancia / combustivel;

        System.out.printf("Velocidade média: %.2f km/h%n", velocidadeMedia);
        System.out.printf("Combustível consumido: %.2f km/l", consumoCombustivel);
    }
}

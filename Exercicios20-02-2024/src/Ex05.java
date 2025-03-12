import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tempo em segundos: ");
        int t = teclado.nextInt(); // para ler os segundos

        int horas = t / 3600; // convertendo em hs
        int minutos = (t % 3600) / 60; // convertendo em min
        int segundos = t % 60; // convertendo em seg

        System.out.println(t + " segundos equivalem a: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
    }
}

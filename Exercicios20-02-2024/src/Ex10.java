import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número n: ");
        int n = teclado.nextInt();

        System.out.print("Agora vamos definir mais dois números. Digite o número inferior: ");
        int inf = teclado.nextInt();

        System.out.print("Digite o número superior: ");
        int sup = teclado.nextInt();

        if (n < inf)
            System.out.println("O número " + n + " está antes do intervalo entre " + inf + " e " + sup);
        else if (n > sup) {
            System.out.println("O número " + n + " está depois do intervalo entre " + inf + " e " + sup);
        }
        else
            System.out.println("O número " + n + " está no intervalo entre " + inf + " e " + sup);
    }
}

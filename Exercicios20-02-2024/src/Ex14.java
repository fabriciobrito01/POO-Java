import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int aluno = 0;
        double soma = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;

        while(true) {
            System.out.print("Digite a nota de um aluno(-1 para encerrar): ");
            double nota = teclado.nextDouble();

            if (nota == -1)
                break;

            soma += nota;
            aluno++;

            if (nota > maiorNota)
                maiorNota = nota;

            if (nota < menorNota)
                menorNota = nota;
        }

        if (aluno > 0) {
            System.out.printf("Quantidade de alunos: %d\n", aluno);
            System.out.printf("Maior nota: %.2f\n", maiorNota);
            System.out.printf("Menor nota: %.2f\n", menorNota);
            System.out.printf("Média da turma: %.2f\n", soma / aluno);
        }
    }
}
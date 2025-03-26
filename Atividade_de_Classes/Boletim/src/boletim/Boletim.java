package boletim;

import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Nota[] b = new Nota[4];

        for (int i = 0; i < 4; i++) {
            b[i] = new Nota(); // Criando o objeto Nota

            System.out.print("Insira o número do bimestre: ");
            int bimestre = scanner.nextInt();
            b[i].setBimestre(bimestre); // Armazena o bimestre

            System.out.print("Insira a nota do bimestre " + bimestre + ": ");
            double valorNota = scanner.nextDouble();
            b[i].setValorNota(valorNota); // Armazena a nota
        }

        scanner.close();

        // Calculando a média
        double somaNotas = 0;
        for (Nota nota : b) {
            somaNotas += nota.getValorNota();
        }
        double media = somaNotas / 4;

        System.out.printf("\nA média das notas é: %.2f\n", media);
    }
}

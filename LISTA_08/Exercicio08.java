import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] F = new int[5];

        System.out.println("Digite os 5 elementos do vetor F:");
        for (int i = 0; i < 5; i++) {
            System.out.print("F[" + i + "]: ");
            F[i] = sc.nextInt();
        }

        int soma = 0;
        boolean temImpar = false;

        for (int i = 0; i < 5; i++) {
            if (F[i] % 2 != 0) {
                soma += F[i];
                temImpar = true;
            }
        }

        if (temImpar) {
            System.out.println("\nSoma dos elementos ímpares: " + soma);
        } else {
            System.out.println("\nO vetor não possui elementos ímpares.");
        }

        sc.close();
    }
}

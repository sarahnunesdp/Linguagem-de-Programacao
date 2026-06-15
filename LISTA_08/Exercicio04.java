import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Digite o número de posições do vetor D (1 a 20): ");
            n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("Valor inválido! Digite um número entre 1 e 20.");
            }
        } while (n < 1 || n > 20);

        int[] D = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor D:");
        for (int i = 0; i < n; i++) {
            System.out.print("D[" + i + "]: ");
            D[i] = sc.nextInt();
        }

        System.out.print("\nVetor D: ");
        for (int i = 0; i < n; i++) {
            System.out.print(D[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

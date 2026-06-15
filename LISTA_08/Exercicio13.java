import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de elementos do vetor P (N <= 10): ");
        int n = sc.nextInt();
        int[] P = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor P:");
        for (int i = 0; i < n; i++) {
            System.out.print("P[" + i + "]: ");
            P[i] = sc.nextInt();
        }

        System.out.print("\nVetor P: ");
        for (int i = 0; i < n; i++) {
            System.out.print(P[i] + " ");
        }

        System.out.print("\n\nDigite o número de elementos do vetor Q (M <= 15): ");
        int m = sc.nextInt();
        int[] Q = new int[m];

        System.out.println("Digite os " + m + " elementos do vetor Q:");
        for (int i = 0; i < m; i++) {
            System.out.print("Q[" + i + "]: ");
            Q[i] = sc.nextInt();
        }

        System.out.print("\nVetor Q: ");
        for (int i = 0; i < m; i++) {
            System.out.print(Q[i] + " ");
        }

        int[] R = new int[n + m];
        for (int i = 0; i < n; i++) {
            R[i] = P[i];
        }
        for (int i = 0; i < m; i++) {
            R[n + i] = Q[i];
        }

        System.out.print("\n\nVetor R (concatenação de P e Q): ");
        for (int i = 0; i < n + m; i++) {
            System.out.print(R[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

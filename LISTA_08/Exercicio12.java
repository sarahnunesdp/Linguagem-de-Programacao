import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] P = new int[10];
        int[] Q = new int[15];

        System.out.println("Digite os 10 elementos do vetor P:");
        for (int i = 0; i < 10; i++) {
            System.out.print("P[" + i + "]: ");
            P[i] = sc.nextInt();
        }

        System.out.print("\nVetor P: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(P[i] + " ");
        }

        System.out.println("\n\nDigite os 15 elementos do vetor Q:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Q[" + i + "]: ");
            Q[i] = sc.nextInt();
        }

        System.out.print("\nVetor Q: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(Q[i] + " ");
        }

        int[] R = new int[25];
        for (int i = 0; i < 10; i++) {
            R[i] = P[i];
        }
        for (int i = 0; i < 15; i++) {
            R[10 + i] = Q[i];
        }

        System.out.print("\n\nVetor R (concatenação de P e Q): ");
        for (int i = 0; i < 25; i++) {
            System.out.print(R[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

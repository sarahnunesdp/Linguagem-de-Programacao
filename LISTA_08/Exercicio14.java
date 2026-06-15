import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] S = new int[10];
        int[] T = new int[15];

        System.out.println("Digite os 10 elementos do vetor S:");
        for (int i = 0; i < 10; i++) {
            System.out.print("S[" + i + "]: ");
            S[i] = sc.nextInt();
        }

        System.out.print("\nVetor S: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(S[i] + " ");
        }

        System.out.println("\n\nDigite os 15 elementos do vetor T:");
        for (int i = 0; i < 15; i++) {
            System.out.print("T[" + i + "]: ");
            T[i] = sc.nextInt();
        }

        System.out.print("\nVetor T: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(T[i] + " ");
        }

        int[] U = new int[25];
        int i = 0, j = 0, k = 0;

        while (i < 10 && j < 15) {
            U[k++] = S[i++];
            U[k++] = T[j++];
        }

        while (j < 15) {
            U[k++] = T[j++];
        }

        System.out.print("\n\nVetor U (intercalação de S e T): ");
        for (int idx = 0; idx < 25; idx++) {
            System.out.print(U[idx] + " ");
        }
        System.out.println();

        sc.close();
    }
}

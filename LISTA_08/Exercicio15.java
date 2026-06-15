import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de elementos do vetor S (N <= 10): ");
        int n = sc.nextInt();
        int[] S = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor S:");
        for (int i = 0; i < n; i++) {
            System.out.print("S[" + i + "]: ");
            S[i] = sc.nextInt();
        }

        System.out.print("\nVetor S: ");
        for (int i = 0; i < n; i++) {
            System.out.print(S[i] + " ");
        }

        System.out.print("\n\nDigite o número de elementos do vetor T (M <= 15): ");
        int m = sc.nextInt();
        int[] T = new int[m];

        System.out.println("Digite os " + m + " elementos do vetor T:");
        for (int i = 0; i < m; i++) {
            System.out.print("T[" + i + "]: ");
            T[i] = sc.nextInt();
        }

        System.out.print("\nVetor T: ");
        for (int i = 0; i < m; i++) {
            System.out.print(T[i] + " ");
        }

        int[] U = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            U[k++] = S[i++];
            U[k++] = T[j++];
        }

        while (i < n) {
            U[k++] = S[i++];
        }

        while (j < m) {
            U[k++] = T[j++];
        }

        System.out.print("\n\nVetor U (intercalação de S e T): ");
        for (int idx = 0; idx < n + m; idx++) {
            System.out.print(U[idx] + " ");
        }
        System.out.println();

        sc.close();
    }
}

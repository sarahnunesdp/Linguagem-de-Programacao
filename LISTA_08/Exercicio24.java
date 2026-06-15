import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a dimensão do vetor AE: ");
        int n = sc.nextInt();

        int[] original = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor AE:");
        for (int i = 0; i < n; i++) {
            System.out.print("AE[" + i + "]: ");
            original[i] = sc.nextInt();
        }

        int qtdImpares = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 2 != 0) {
                qtdImpares++;
            }
        }

        int[] AE = new int[qtdImpares];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 2 != 0) {
                AE[j] = original[i];
                j++;
            }
        }

        for (int i = 0; i < AE.length - 1; i++) {
            for (int k = 0; k < AE.length - 1 - i; k++) {
                if (AE[k] < AE[k + 1]) {
                    int temp = AE[k];
                    AE[k] = AE[k + 1];
                    AE[k + 1] = temp;
                }
            }
        }

        System.out.print("\nVetor AE ordenado (somente ímpares, decrescente): ");
        if (AE.length == 0) {
            System.out.print("(nenhum elemento ímpar encontrado)");
        } else {
            for (int i = 0; i < AE.length; i++) {
                System.out.print(AE[i] + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}

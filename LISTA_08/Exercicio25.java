import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a dimensão do vetor AF: ");
        int n = sc.nextInt();

        int[] original = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor AF:");
        for (int i = 0; i < n; i++) {
            System.out.print("AF[" + i + "]: ");
            original[i] = sc.nextInt();
        }

        int qtdImpares = 0;
        int qtdPares = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 2 != 0) {
                qtdImpares++;
            } else {
                qtdPares++;
            }
        }

        int[] impares = new int[qtdImpares];
        int[] pares = new int[qtdPares];
        int ii = 0, pi = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 2 != 0) {
                impares[ii++] = original[i];
            } else {
                pares[pi++] = original[i];
            }
        }

        for (int i = 0; i < impares.length - 1; i++) {
            for (int k = 0; k < impares.length - 1 - i; k++) {
                if (impares[k] > impares[k + 1]) {
                    int temp = impares[k];
                    impares[k] = impares[k + 1];
                    impares[k + 1] = temp;
                }
            }
        }

        for (int i = 0; i < pares.length - 1; i++) {
            for (int k = 0; k < pares.length - 1 - i; k++) {
                if (pares[k] < pares[k + 1]) {
                    int temp = pares[k];
                    pares[k] = pares[k + 1];
                    pares[k + 1] = temp;
                }
            }
        }

        int[] AF = new int[n];
        int idx = 0;
        for (int i = 0; i < impares.length; i++) {
            AF[idx++] = impares[i];
        }
        for (int i = 0; i < pares.length; i++) {
            AF[idx++] = pares[i];
        }

        System.out.print("\nVetor AF ordenado (ímpares crescente + pares decrescente): ");
        for (int i = 0; i < n; i++) {
            System.out.print(AF[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

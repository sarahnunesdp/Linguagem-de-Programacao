import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a dimensão do vetor AD: ");
        int n = sc.nextInt();

        int[] original = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor AD:");
        for (int i = 0; i < n; i++) {
            System.out.print("AD[" + i + "]: ");
            original[i] = sc.nextInt();
        }

        int qtdPares = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 2 == 0) {
                qtdPares++;
            }
        }

        int[] AD = new int[qtdPares];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (original[i] % 2 == 0) {
                AD[j] = original[i];
                j++;
            }
        }

        for (int i = 0; i < AD.length - 1; i++) {
            for (int k = 0; k < AD.length - 1 - i; k++) {
                if (AD[k] > AD[k + 1]) {
                    int temp = AD[k];
                    AD[k] = AD[k + 1];
                    AD[k + 1] = temp;
                }
            }
        }

        System.out.print("\nVetor AD ordenado (somente pares, crescente): ");
        if (AD.length == 0) {
            System.out.print("(nenhum elemento par encontrado)");
        } else {
            for (int i = 0; i < AD.length; i++) {
                System.out.print(AD[i] + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}

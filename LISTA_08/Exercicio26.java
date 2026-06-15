import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio26 {

    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a dimensão do vetor AG: ");
        int n = sc.nextInt();

        int[] original = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor AG:");
        for (int i = 0; i < n; i++) {
            System.out.print("AG[" + i + "]: ");
            original[i] = sc.nextInt();
        }

        int qtdPrimos = 0;
        for (int i = 0; i < n; i++) {
            if (ehPrimo(original[i])) {
                qtdPrimos++;
            }
        }

        int[] AG = new int[qtdPrimos];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (ehPrimo(original[i])) {
                AG[j] = original[i];
                j++;
            }
        }

        for (int i = 0; i < AG.length - 1; i++) {
            for (int k = 0; k < AG.length - 1 - i; k++) {
                if (AG[k] > AG[k + 1]) {
                    int temp = AG[k];
                    AG[k] = AG[k + 1];
                    AG[k + 1] = temp;
                }
            }
        }

        System.out.print("\nVetor AG ordenado (somente primos, crescente): ");
        if (AG.length == 0) {
            System.out.print("(nenhum número primo encontrado)");
        } else {
            for (int i = 0; i < AG.length; i++) {
                System.out.print(AG[i] + " ");
            }
        }
        System.out.println();

        sc.close();
    }
}

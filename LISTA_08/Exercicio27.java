import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite a dimensão do vetor AH (>= 25): ");
            n = sc.nextInt();
            if (n < 25) {
                System.out.println("Valor inválido! A dimensão deve ser >= 25.");
            }
        } while (n < 25);

        int[] AH = new int[n];
        System.out.println("Digite os " + n + " elementos do vetor AH:");
        for (int i = 0; i < n; i++) {
            System.out.print("AH[" + i + "]: ");
            AH[i] = sc.nextInt();
        }

        int m;
        do {
            System.out.print("Digite a dimensão do vetor AI (2 a 5): ");
            m = sc.nextInt();
            if (m < 2 || m > 5) {
                System.out.println("Valor inválido! A dimensão deve estar entre 2 e 5.");
            }
        } while (m < 2 || m > 5);

        int[] AI = new int[m];
        System.out.println("Digite os " + m + " elementos do vetor AI:");
        for (int i = 0; i < m; i++) {
            System.out.print("AI[" + i + "]: ");
            AI[i] = sc.nextInt();
        }

        int posicaoEncontrada = -1;
        for (int i = 0; i <= n - m; i++) {
            boolean igual = true;
            for (int j = 0; j < m; j++) {
                if (AH[i + j] != AI[j]) {
                    igual = false;
                    break;
                }
            }
            if (igual) {
                posicaoEncontrada = i;
                break;
            }
        }

        if (posicaoEncontrada == -1) {
            System.out.println("\nErro: o vetor AI não está contido no vetor AH.");
        } else {
            System.out.println("\nO vetor AI está contido em AH, começando na posição " + posicaoEncontrada + ".");
        }

        sc.close();
    }
}

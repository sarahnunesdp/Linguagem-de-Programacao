import java.util.Scanner;
import java.util.Random;

// Sarah Nunes do Prado

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int n;
        do {
            System.out.print("Digite a dimensão do vetor AJ (>= 10): ");
            n = sc.nextInt();
            if (n < 10) {
                System.out.println("Valor inválido! A dimensão deve ser >= 10.");
            }
        } while (n < 10);

        int[] AJ = new int[n];

        for (int i = 0; i < n; i++) {
            int novoNumero;
            boolean repetido;
            do {
                novoNumero = random.nextInt(1000) + 1;
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (AJ[j] == novoNumero) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            AJ[i] = novoNumero;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (AJ[j] > AJ[j + 1]) {
                    int temp = AJ[j];
                    AJ[j] = AJ[j + 1];
                    AJ[j + 1] = temp;
                }
            }
        }

        System.out.println("\nTente adivinhar um número que está no vetor (você tem 10 tentativas).");
        boolean acertou = false;
        int posicaoAcerto = -1;
        int palpite = 0;

        for (int tentativa = 1; tentativa <= 10 && !acertou; tentativa++) {
            System.out.print("Tentativa " + tentativa + "/10: ");
            palpite = sc.nextInt();

            for (int i = 0; i < n; i++) {
                if (AJ[i] == palpite) {
                    acertou = true;
                    posicaoAcerto = i;
                    break;
                }
            }

            if (!acertou) {
                System.out.println("Esse número não está no vetor. Tente novamente!");
            }
        }

        if (acertou) {
            System.out.println("\nParabéns! Você acertou!");
            System.out.print("Vetor AJ: ");
            for (int i = 0; i < n; i++) {
                System.out.print(AJ[i] + " ");
            }
            System.out.println("\nO número " + palpite + " está na posição " + posicaoAcerto + ".");
        } else {
            System.out.println("\nVocê não conseguiu acertar em 10 tentativas. Fim de jogo!");
            System.out.print("O vetor AJ era: ");
            for (int i = 0; i < n; i++) {
                System.out.print(AJ[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] G = new int[5];

        System.out.println("Digite os 5 elementos do vetor G:");
        for (int i = 0; i < 5; i++) {
            System.out.print("G[" + i + "]: ");
            G[i] = sc.nextInt();
        }

        int qtdPares = 0;
        for (int i = 0; i < 5; i++) {
            if (G[i] % 2 == 0) {
                qtdPares++;
            }
        }

        if (qtdPares == 0) {
            System.out.println("\nO vetor G não possui elementos pares. Encerrando o programa.");
            sc.close();
            return;
        }

        int[] H = new int[qtdPares];
        int j = 0;
        for (int i = 0; i < 5; i++) {
            if (G[i] % 2 == 0) {
                H[j] = G[i];
                j++;
            }
        }

        System.out.print("\nVetor H (elementos pares de G): ");
        for (int i = 0; i < H.length; i++) {
            System.out.print(H[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] PA = new int[5];
        int[] PB = new int[5];

        System.out.println("Digite os 5 elementos do vetor PA:");
        for (int i = 0; i < 5; i++) {
            System.out.print("PA[" + i + "]: ");
            PA[i] = sc.nextInt();
        }

        System.out.println("Digite os 5 elementos do vetor PB:");
        for (int i = 0; i < 5; i++) {
            System.out.print("PB[" + i + "]: ");
            PB[i] = sc.nextInt();
        }

        System.out.print("\nVetor PA: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(PA[i] + " ");
        }

        System.out.print("\nVetor PB: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(PB[i] + " ");
        }

        int[] PC = new int[10];
        for (int i = 0; i < 5; i++) {
            PC[i] = PA[i];
        }
        for (int i = 0; i < 5; i++) {
            PC[5 + i] = PB[i];
        }

        System.out.print("\n\nVetor PC (concatenação de PA e PB): ");
        for (int i = 0; i < 10; i++) {
            System.out.print(PC[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

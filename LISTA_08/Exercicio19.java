import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] Z = new int[10];

        System.out.println("Digite os 10 elementos do vetor Z:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Z[" + i + "]: ");
            Z[i] = sc.nextInt();
        }

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1 - i; j++) {
                if (Z[j] > Z[j + 1]) {
                    int temp = Z[j];
                    Z[j] = Z[j + 1];
                    Z[j + 1] = temp;
                }
            }
        }

        System.out.print("\nVetor Z em ordem crescente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(Z[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

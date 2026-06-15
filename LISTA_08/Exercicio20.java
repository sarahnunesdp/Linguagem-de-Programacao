import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] AA = new int[10];

        System.out.println("Digite os 10 elementos do vetor AA:");
        for (int i = 0; i < 10; i++) {
            System.out.print("AA[" + i + "]: ");
            AA[i] = sc.nextInt();
        }

        for (int i = 0; i < 10 - 1; i++) {
            for (int j = 0; j < 10 - 1 - i; j++) {
                if (AA[j] < AA[j + 1]) {
                    int temp = AA[j];
                    AA[j] = AA[j + 1];
                    AA[j + 1] = temp;
                }
            }
        }

        System.out.print("\nVetor AA em ordem decrescente: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(AA[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

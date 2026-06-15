import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] QA = new int[5];
        int[] QB = new int[5];

        System.out.println("Digite os 5 elementos do vetor QA:");
        for (int i = 0; i < 5; i++) {
            System.out.print("QA[" + i + "]: ");
            QA[i] = sc.nextInt();
        }

        System.out.println("Digite os 5 elementos do vetor QB:");
        for (int i = 0; i < 5; i++) {
            System.out.print("QB[" + i + "]: ");
            QB[i] = sc.nextInt();
        }

        System.out.print("\nVetor QA: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(QA[i] + " ");
        }

        System.out.print("\nVetor QB: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(QB[i] + " ");
        }

        int[] QC = new int[10];
        int k = 0;
        for (int i = 0; i < 5; i++) {
            QC[k] = QA[i];
            k++;
            QC[k] = QB[i];
            k++;
        }

        System.out.print("\n\nVetor QC (intercalação de QA e QB): ");
        for (int i = 0; i < 10; i++) {
            System.out.print(QC[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] A = new int[15];

        System.out.println("Digite os 15 elementos do vetor A:");
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }

        System.out.print("\nVetor A: ");
        for (int i = 0; i < 15; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

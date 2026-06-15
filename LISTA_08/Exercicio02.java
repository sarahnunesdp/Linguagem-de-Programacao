import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] B = new int[15];

        System.out.println("Digite os 15 elementos do vetor B:");
        for (int i = 0; i < 15; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        System.out.print("\nVetor B em ordem invertida: ");
        for (int i = 14; i >= 0; i--) {
            System.out.print(B[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

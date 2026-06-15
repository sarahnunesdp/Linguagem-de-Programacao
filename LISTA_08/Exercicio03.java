import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de posições do vetor C (N <= 20): ");
        int n = sc.nextInt();

        int[] C = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor C:");
        for (int i = 0; i < n; i++) {
            System.out.print("C[" + i + "]: ");
            C[i] = sc.nextInt();
        }

        System.out.print("\nVetor C: ");
        for (int i = 0; i < n; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos da sequência de Fibonacci (N <= 20): ");
        int n = sc.nextInt();

        int[] V = new int[n];

        if (n >= 1) V[0] = 0;
        if (n >= 2) V[1] = 1;

        for (int i = 2; i < n; i++) {
            V[i] = V[i - 1] + V[i - 2];
        }

        System.out.print("\nVetor V (sequência de Fibonacci): ");
        for (int i = 0; i < n; i++) {
            System.out.print(V[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

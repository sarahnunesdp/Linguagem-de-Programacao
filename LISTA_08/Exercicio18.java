import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos da sequência de Fatoriais (N <= 15): ");
        int n = sc.nextInt();

        long[] Y = new long[n];

        for (int i = 0; i < n; i++) {
            long fatorial = 1;
            for (int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            Y[i] = fatorial;
        }

        System.out.print("\nVetor Y (sequência de Fatoriais, de 0! até " + (n - 1) + "!): ");
        for (int i = 0; i < n; i++) {
            System.out.print(Y[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

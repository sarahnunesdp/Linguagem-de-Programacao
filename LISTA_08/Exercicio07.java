import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor E (N <= 20): ");
        int n = sc.nextInt();

        int[] E = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor E:");
        for (int i = 0; i < n; i++) {
            System.out.print("E[" + i + "]: ");
            E[i] = sc.nextInt();
        }

        int maior = E[0];
        int menor = E[0];

        for (int i = 1; i < n; i++) {
            if (E[i] > maior) {
                maior = E[i];
            }
            if (E[i] < menor) {
                menor = E[i];
            }
        }

        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        sc.close();
    }
}

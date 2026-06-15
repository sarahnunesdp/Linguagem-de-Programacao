import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite o número de posições do vetor AC (1 a 20): ");
            n = sc.nextInt();
            if (n < 1 || n > 20) {
                System.out.println("Valor inválido! N deve estar entre 1 e 20.");
            }
        } while (n < 1 || n > 20);

        System.out.print("Digite o valor máximo permitido para os elementos: ");
        int valorMaximo = sc.nextInt();

        int[] AC = new int[n];

        System.out.println("Digite os " + n + " elementos do vetor AC (cada um <= " + valorMaximo + "):");
        for (int i = 0; i < n; i++) {
            int valor;
            do {
                System.out.print("AC[" + i + "]: ");
                valor = sc.nextInt();
                if (valor > valorMaximo) {
                    System.out.println("Valor inválido! Deve ser menor ou igual a " + valorMaximo + ".");
                }
            } while (valor > valorMaximo);
            AC[i] = valor;
        }

        System.out.print("\nVetor AC: ");
        for (int i = 0; i < n; i++) {
            System.out.print(AC[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

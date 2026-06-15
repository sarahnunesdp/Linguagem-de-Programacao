import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de elementos do vetor AM (N <= 10): ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] AM = new String[n];

        System.out.println("Digite os " + n + " valores (palavras ou frases) do vetor AM:");
        for (int i = 0; i < n; i++) {
            System.out.print("AM[" + i + "]: ");
            AM[i] = sc.nextLine();
        }

        System.out.println("\nVetor AM " + formataVetor(AM));
        System.out.println("   (vetor original - " + n + " elementos)");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (AM[j].compareTo(AM[j + 1]) > 0) {
                    String temp = AM[j];
                    AM[j] = AM[j + 1];
                    AM[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor AM " + formataVetor(AM));
        System.out.println("   (vetor ordenado - " + n + " elementos)");

        sc.close();
    }

    public static String formataVetor(String[] vetor) {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < vetor.length; i++) {
            sb.append("\"").append(vetor[i]).append("\"");
            if (i < vetor.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}

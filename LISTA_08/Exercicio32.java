import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String[] AN = frase.trim().split("\\s+");
        int n = AN.length;

        System.out.println("Quantidade de palavras: " + n);

        System.out.println("\nVetor AN " + formataVetor(AN));
        System.out.println("   (vetor original - " + n + " elementos)");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (AN[j].compareTo(AN[j + 1]) > 0) {
                    String temp = AN[j];
                    AN[j] = AN[j + 1];
                    AN[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor AN " + formataVetor(AN));
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

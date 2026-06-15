import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de elementos do vetor AK: ");
        int n = sc.nextInt();

        double[] AK = new double[n];

        System.out.println("Digite os " + n + " elementos (decimais) do vetor AK:");
        for (int i = 0; i < n; i++) {
            System.out.print("AK[" + i + "]: ");
            AK[i] = sc.nextDouble();
        }

        System.out.println("\nVetor AK " + formataVetor(AK));
        System.out.println("   (vetor original - " + n + " elementos)");

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (AK[j] > AK[j + 1]) {
                    double temp = AK[j];
                    AK[j] = AK[j + 1];
                    AK[j + 1] = temp;
                }
            }
        }

        System.out.println("\nVetor AK " + formataVetor(AK));
        System.out.println("   (vetor ordenado - " + n + " elementos)");

        double[] AL = new double[2 * n - 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            AL[idx++] = AK[i];
            if (i < n - 1) {
                AL[idx++] = (AK[i] + AK[i + 1]) / 2.0;
            }
        }

        System.out.println("\nVetor AL " + formataVetor(AL));
        System.out.println("   (vetor com as médias - " + AL.length + " elementos)");

        sc.close();
    }

    public static String formataVetor(double[] vetor) {
        StringBuilder sb = new StringBuilder("[ ");
        for (int i = 0; i < vetor.length; i++) {
            sb.append(vetor[i]);
            if (i < vetor.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}

import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a dimensão dos vetores (n <= 15): ");
        int n = sc.nextInt();

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];

        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = sc.nextInt();
        }

        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < n; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = sc.nextInt();
        }

        System.out.println("\nPosições em que os elementos são iguais:");
        boolean encontrou = false;
        for (int i = 0; i < n; i++) {
            if (vetor1[i] == vetor2[i]) {
                System.out.println("Posição " + i + ": " + vetor1[i] + " == " + vetor2[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhuma posição com elementos iguais.");
        }

        sc.close();
    }
}

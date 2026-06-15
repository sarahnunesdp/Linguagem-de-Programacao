import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] AB = new int[10];

        System.out.println("Digite os 10 elementos do vetor AB:");
        for (int i = 0; i < 10; i++) {
            System.out.print("AB[" + i + "]: ");
            AB[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (AB[i] % 2 != 0) {
                AB[i] = AB[i] * 2;
            }
        }

        System.out.print("\nVetor AB (agora somente com elementos pares): ");
        for (int i = 0; i < 10; i++) {
            System.out.print(AB[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

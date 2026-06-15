import java.util.Scanner;

// Sarah Nunes do Prado

public class Exercicio17 {

    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de elementos da sequência de Primos (N <= 20): ");
        int n = sc.nextInt();

        int[] X = new int[n];
        int contador = 0;
        int numero = 2;

        while (contador < n) {
            if (ehPrimo(numero)) {
                X[contador] = numero;
                contador++;
            }
            numero++;
        }

        System.out.print("\nVetor X (sequência de números Primos): ");
        for (int i = 0; i < n; i++) {
            System.out.print(X[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

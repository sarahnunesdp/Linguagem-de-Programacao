import java.util.Scanner;

//Exercicio 28 - Dobrar a String ao meio concatenando seus caracteres
//Nome: Sarah Nunes do Prado

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String entrada = sc.nextLine();
        int n = entrada.length();
        String resultado = "";

        for (int k = 0; k < n / 2; k++) {
            resultado += entrada.charAt(k);
            resultado += entrada.charAt(n - 1 - k);
        }

        if (n % 2 != 0) {
            resultado += entrada.charAt(n / 2);
        }

        System.out.println("Saida: " + resultado);
        sc.close();
    }
}
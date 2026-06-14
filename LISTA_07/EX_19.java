import java.util.Scanner;

//Exercicio 19 - Verificar se e palindromo
//Nome: Sarah Nunes do Prado

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        boolean palindromo = true;
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                palindromo = false;
            }
        }

        System.out.println(palindromo ? "E um palindromo." : "NAO e um palindromo.");
        sc.close();
    }
}
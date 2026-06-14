import java.util.Scanner;

//Exercicio 21 - Imprimir cada palavra em uma linha
//Nome: Sarah Nunes do Prado

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String palavraAtual = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != ' ') {
                palavraAtual += c;
            } else if (palavraAtual.length() > 0) {
                System.out.println(palavraAtual);
                palavraAtual = "";
            }
        }

        if (palavraAtual.length() > 0) {
            System.out.println(palavraAtual);
        }

        sc.close();
    }
}
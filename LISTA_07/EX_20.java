import java.util.Scanner;

//Exercicio 20 - Contar o numero de palavras de uma frase
//Nome: Sarah Nunes do Prado

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int palavras = 0;
        boolean dentroDePalavra = false;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != ' ') {
                if (!dentroDePalavra) {
                    palavras++;
                    dentroDePalavra = true;
                }
            } else {
                dentroDePalavra = false;
            }
        }

        System.out.println("Quantidade de palavras: " + palavras);
        sc.close();
    }
}
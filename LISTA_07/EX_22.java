import java.util.Scanner;

//Exercicio 22 - Contar ocorrencias de uma palavra na frase
//Nome: Sarah Nunes do Prado

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = sc.nextLine().toUpperCase();

        System.out.print("Digite a palavra a procurar: ");
        String palavra = sc.nextLine().toUpperCase();

        int contador = 0;
        int tamPalavra = palavra.length();

        for (int i = 0; i <= frase.length() - tamPalavra; i++) {
            boolean encontrou = true;

            for (int j = 0; j < tamPalavra; j++) {
                if (frase.charAt(i + j) != palavra.charAt(j)) {
                    encontrou = false;
                }
            }

            if (encontrou) {
                contador++;
            }
        }

        System.out.println("A palavra '" + palavra + "' ocorre " + contador + " vez(es).");
        sc.close();
    }
}
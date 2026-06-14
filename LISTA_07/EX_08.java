import java.util.Scanner;

//Exercicio 08 - Contar ocorrencias de cada letra (sem mostrar zeros)
//Nome: Sarah Nunes do Prado

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int[] contagem = new int[26];

        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (c >= 'a' && c <= 'z') {
                contagem[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (contagem[i] > 0) {
                char letra = (char) ('a' + i);
                System.out.println(letra + ": " + contagem[i]);
            }
        }

        sc.close();
    }
}
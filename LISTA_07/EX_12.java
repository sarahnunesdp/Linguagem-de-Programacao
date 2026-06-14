import java.util.Scanner;

//Exercicio 12 - Contar ocorrencias de cada vogal
//Nome: Sarah Nunes do Prado

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String vogais = "aeiou";
        int[] contagem = new int[5];
        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            int posicao = vogais.indexOf(c);
            if (posicao != -1) {
                contagem[posicao]++;
            }
        }

        for (int i = 0; i < vogais.length(); i++) {
            System.out.println(vogais.charAt(i) + ": " + contagem[i]);
        }

        sc.close();
    }
}
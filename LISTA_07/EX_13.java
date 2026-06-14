import java.util.Scanner;

//Exercicio 13 - Contar consoantes
//Nome: Sarah Nunes do Prado

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        String vogais = "aeiou";
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = Character.toLowerCase(frase.charAt(i));
            if (Character.isLetter(c) && vogais.indexOf(c) == -1) {
                contador++;
            }
        }

        System.out.println("Quantidade de consoantes: " + contador);
        sc.close();
    }
}
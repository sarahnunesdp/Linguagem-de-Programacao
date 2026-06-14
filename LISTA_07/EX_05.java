import java.util.Scanner;


//Exercicio 05 - Contar ocorrencias da letra 'a'
//Nome: Sarah Nunes do Prado
 

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) == 'a') {
            }
        }

        System.out.println("A letra 'a' aparece " + contador + " vez(es).");
        sc.close();
    }
}
import java.util.Scanner;

//Exercicio 06 - Contar ocorrencias de um caractere escolhido
//Nome: Sarah Nunes do Prado

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.print("Digite o caractere a procurar: ");
        char alvo = sc.next().charAt(0);

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.toLowerCase(c) == Character.toLowerCase(alvo)) {
                contador++;
            }
        }

        System.out.println("'" + alvo + "' aparece " + contador + " vez(es).");
        sc.close();
    }
}
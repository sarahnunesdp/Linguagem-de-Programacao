import java.util.Scanner;

//Exercicio 09 - Contar espacos em branco
//Nome: Sarah Nunes do Prado

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }

        System.out.println("Quantidade de espacos em branco: " + contador);
        sc.close();
    }
}
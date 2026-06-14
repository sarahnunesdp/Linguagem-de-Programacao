import java.util.Scanner;

//Exercicio 10 - Contar letras maiusculas
//Nome: Sarah Nunes do Prado

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isUpperCase(frase.charAt(i))) {
                contador++;
            }
        }

        System.out.println("Quantidade de letras maiusculas: " + contador);
        sc.close();
    }
}
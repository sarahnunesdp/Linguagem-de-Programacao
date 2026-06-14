import java.util.Scanner;

//Exercicio 11 - Contar caracteres alfabeticos e digitos numericos
//Nome: Sarah Nunes do Prado

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        int letras = 0;
        int digitos = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                letras++;
            } else if (Character.isDigit(c)) {
                digitos++;
            }
        }

        System.out.println("Caracteres alfabeticos: " + letras);
        System.out.println("Digitos numericos: " + digitos);
        sc.close();
    }
}
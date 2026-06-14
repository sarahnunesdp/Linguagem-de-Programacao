import java.util.Scanner;

//Exercicio 15 - Verificar se existem caracteres numericos
//Nome: Sarah Nunes do Prado

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        boolean temNumero = false;

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isDigit(frase.charAt(i))) {
                temNumero = true;
            }
        }

        if (temNumero) {
            System.out.println("A frase possui caracteres numericos.");
        } else {
            System.out.println("A frase NAO possui caracteres numericos.");
        }

        sc.close();
    }
}
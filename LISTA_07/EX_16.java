import java.util.Scanner;

//Exercicio 16 - Verificar se todas as letras sao maiusculas
//Nome: Sarah Nunes do Prado
 
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        boolean todasMaiusculas = true;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                todasMaiusculas = false;
            }
        }

        if (todasMaiusculas) {
            System.out.println("Todos os caracteres alfabeticos sao maiusculos.");
        } else {
            System.out.println("NAO sao todos maiusculos.");
        }

        sc.close();
    }
}
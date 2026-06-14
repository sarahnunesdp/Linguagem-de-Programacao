import java.util.Scanner;

//Exercicio 30 - Cifra ROT-13
//Nome: Sarah Nunes do Prado

public class Exercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o texto: ");
        String texto = sc.nextLine();

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (c >= 'a' && c <= 'z') {
                int nova = (c - 'a' + 13) % 26;
                resultado += (char) ('a' + nova);
            } else if (c >= 'A' && c <= 'Z') {
                int nova = (c - 'A' + 13) % 26;
                resultado += (char) ('A' + nova);
            } else {
                resultado += c;
            }
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
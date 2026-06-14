import java.util.Scanner;

//Exercicio 14 - Substituir caractere por asterisco
//Nome: Sarah Nunes do Prado

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a frase: ");
        String frase = sc.nextLine();

        System.out.print("Digite o caractere a substituir: ");
        char alvo = sc.next().charAt(0);

        String resultado = "";

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == alvo) {
                resultado += '*';
            } else {
                resultado += c;
            }
        }

        System.out.println(resultado);
        sc.close();
    }
}
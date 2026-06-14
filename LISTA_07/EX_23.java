import java.util.Scanner;

//Exercicio 23 - Extrair o sobrenome do nome completo
//Nome: Sarah Nunes do Prado

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nome = sc.nextLine();

        int posicaoUltimoEspaco = -1;

        for (int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                posicaoUltimoEspaco = i;
            }
        }

        String sobrenome = nome.substring(posicaoUltimoEspaco + 1);
        System.out.println("Sobrenome: " + sobrenome);

        sc.close();
    }
}
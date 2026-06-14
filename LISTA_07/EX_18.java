import java.util.Scanner;

//Exercicio 18 - Verificar se e uma sequencia binaria de 8 bits
//Nome: Sarah Nunes do Prado

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sequencia: ");
        String seq = sc.nextLine();

        boolean valido = true;

        if (seq.length() != 8) {
            valido = false;
        } else {
            for (int i = 0; i < seq.length(); i++) {
                char c = seq.charAt(i);
                if (c != '0' && c != '1') {
                    valido = false;
                }
            }
        }

        System.out.println(valido ? "E uma sequencia de 8 bits." : "NAO e uma sequencia de 8 bits.");
        sc.close();
    }
}
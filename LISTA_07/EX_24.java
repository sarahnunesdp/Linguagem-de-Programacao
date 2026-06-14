import java.util.Scanner;

//Exercicio 24 - Maior sequencia consecutiva de 1's
//Nome: Sarah Nunes do Prado

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sequencia de 0s e 1s: ");
        String seq = sc.nextLine();

        int atual = 0;
        int maior = 0;

        for (int i = 0; i < seq.length(); i++) {
            if (seq.charAt(i) == '1') {
                atual++;
                if (atual > maior) {
                    maior = atual;
                }
            } else {
                atual = 0;
            }
        }

        System.out.println("Maior sequencia de 1's: " + maior);
        sc.close();
    }
}
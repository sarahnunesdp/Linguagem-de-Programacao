import java.util.Scanner;

//Exercicio 17 - Comparar duas frases caractere por caractere
//Nome: Sarah Nunes do Prado

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira frase: ");
        String frase1 = sc.nextLine();

        System.out.print("Digite a segunda frase: ");
        String frase2 = sc.nextLine();

        boolean iguais = true;

        if (frase1.length() != frase2.length()) {
            iguais = false;
        } else {
            for (int i = 0; i < frase1.length(); i++) {
                if (frase1.charAt(i) != frase2.charAt(i)) {
                    iguais = false;
                }
            }
        }

        System.out.println(iguais ? "As frases sao iguais." : "As frases sao diferentes.");
        sc.close();
    }
}
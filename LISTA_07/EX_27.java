import java.util.Scanner;

//Exercicio 27 - Concatenar (intercalar) duas Strings de mesmo tamanho
//Nome: Sarah Nunes do Prado

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrada 1: ");
        String s1 = sc.nextLine();

        System.out.print("Entrada 2: ");
        String s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Erro! Entradas de tamanhos diferentes.");
        } else {
            String resultado = "";
            for (int i = 0; i < s1.length(); i++) {
                resultado += s1.charAt(i);
                resultado += s2.charAt(i);
            }
            System.out.println("Saida: " + resultado);
        }

        sc.close();
    }
}
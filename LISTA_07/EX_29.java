import java.util.Scanner;

//Exercicio 29 - Menu Zenit Polar (criptografar/descriptografar)
//Nome: Sarah Nunes do Prado
 
public class Exercicio29 {

    static String zenitPolar(String texto) {
        String de = "zenitpolar";
        String para = de.substring(5) + de.substring(0, 5);
        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            int pos = de.indexOf(Character.toLowerCase(c));

            if (pos != -1) {
                char substituto = para.charAt(pos);
                if (Character.isUpperCase(c)) {
                    substituto = Character.toUpperCase(substituto);
                }
                resultado += substituto;
            } else {
                resultado += c;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            System.out.println("1 - Criptografar");
            System.out.println("2 - Descriptografar");
            System.out.println("3 - Sair");
            System.out.print("Opcao: ");

            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Digite o texto plano: ");
                String plano = sc.nextLine();
                System.out.println("Resultado: " + zenitPolar(plano));
            } else if (opcao == 2) {
                System.out.print("Digite o texto cifrado: ");
                String cifrado = sc.nextLine();
                System.out.println("Resultado: " + zenitPolar(cifrado));
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opcao invalida! Tente novamente.");
            }

        } while (opcao != 3);

        sc.close();
    }
}
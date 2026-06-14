import java.util.Scanner;

//Exercicio 25 - Validador de senha forte
//Nome: Sarah Nunes do Prado

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String simbolos = "!@#$%&*()+";
        boolean senhaValida;

        do {
            System.out.print("Senha: ");
            String senha = sc.nextLine();

            int letras = 0;
            int numeros = 0;
            int simb = 0;

            for (int i = 0; i < senha.length(); i++) {
                char c = senha.charAt(i);
                if (Character.isLetter(c)) {
                    letras++;
                } else if (Character.isDigit(c)) {
                    numeros++;
                } else if (simbolos.indexOf(c) != -1) {
                    simb++;
                }
            }

            boolean tamanhoOk = senha.length() >= 10;
            boolean letrasOk = letras >= 3;
            boolean numerosOk = numeros >= 3;
            boolean simbolosOk = simb >= 2;

            System.out.println("Regras");
            System.out.println("Tamanho 10: " + senha.length() + (tamanhoOk ? " (ok)" : " (x)"));
            System.out.println("Letras 3: " + letras + (letrasOk ? " (ok)" : " (x)"));
            System.out.println("Numeros 3: " + numeros + (numerosOk ? " (ok)" : " (x)"));
            System.out.println("Simbolos 2: " + simb + (simbolosOk ? " (ok)" : " (x)"));
            System.out.println();

            senhaValida = tamanhoOk && letrasOk && numerosOk && simbolosOk;

            if (senhaValida) {
                System.out.println("Senha aprovada! Parabens!");
            } else {
                System.out.println("Senha reprovada! Tente novamente.");
                System.out.println();
            }

        } while (!senhaValida);

        sc.close();
    }
}
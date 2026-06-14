import java.util.Random;

//Exercicio 26 - Desafio: sequencia aleatoria de 100 letras
//Nome: Sarah Nunes do Prado

public class Exercicio26 {
    public static void main(String[] args) {
        Random rand = new Random();
        String sequencia = "";

        for (int i = 0; i < 100; i++) {
            char letra = (char) ('a' + rand.nextInt(26));
            sequencia += letra;
        }

        System.out.println("Sequencia gerada:");
        System.out.println(sequencia);
        System.out.println();

        int[] contagem = new int[26];
        for (int i = 0; i < sequencia.length(); i++) {
            contagem[sequencia.charAt(i) - 'a']++;
        }

        String faltantes = "";
        for (int i = 0; i < 26; i++) {
            if (contagem[i] == 0) {
                faltantes += (char) ('a' + i);
            }
        }

        if (faltantes.length() > 0) {
            System.out.println("Letras que NAO aparecem: " + faltantes);
        } else {
            System.out.println("Todas as letras do alfabeto aparecem.");
        }

        int atualRep = 1, maiorRep = 1;
        for (int i = 1; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == sequencia.charAt(i - 1)) {
                atualRep++;
                if (atualRep > maiorRep) maiorRep = atualRep;
            } else {
                atualRep = 1;
            }
        }
        System.out.println("Maior sequencia de letras repetidas: " + maiorRep);

        String vogais = "aeiou";
        int atualVog = 0, maiorVog = 0;
        for (int i = 0; i < sequencia.length(); i++) {
            if (vogais.indexOf(sequencia.charAt(i)) != -1) {
                atualVog++;
                if (atualVog > maiorVog) maiorVog = atualVog;
            } else {
                atualVog = 0;
            }
        }

        if (maiorVog > 0) {
            System.out.println("Maior sequencia de vogais: " + maiorVog);
        } else {
            System.out.println("Nao ha sequencia de vogais.");
        }

        int atualAlf = 1, maiorAlf = 1;
        for (int i = 1; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == sequencia.charAt(i - 1) + 1) {
                atualAlf++;
                if (atualAlf > maiorAlf) maiorAlf = atualAlf;
            } else {
                atualAlf = 1;
            }
        }
        System.out.println("Maior sequencia alfabetica: " + maiorAlf);
    }
}
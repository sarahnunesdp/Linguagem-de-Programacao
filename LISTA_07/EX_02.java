//Exercicio 02 - Alfabeto maiusculo
//Nome: Sarah Nunes do Prado

public class Exercicio02 {
    public static void main(String[] args) {
        String alfabeto = ""; 
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('A' + i);
            alfabeto += letra;
        }

        System.out.println(alfabeto);
    }
}
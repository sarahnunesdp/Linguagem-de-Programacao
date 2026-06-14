//Exercicio 04 - Caracteres numericos
//Nome: Sarah Nunes do Prado

public class Exercicio04 {
    public static void main(String[] args) {
        String numeros = "";

        for (int i = 0; i < 10; i++) {
            char digito = (char) ('0' + i);
            numeros += digito;
        }

        System.out.println(numeros);
    }
}
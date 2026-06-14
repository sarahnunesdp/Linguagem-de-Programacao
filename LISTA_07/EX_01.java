//Exercicio 01 - Tabela ASCII
//Nome: Sarah Nunes do Prado
 

public class Exercicio01 {
    public static void main(String[] args) {
        for (int codigo = 0; codigo <= 127; codigo++) {
            char caractere = (char) codigo;
            System.out.println(codigo + " -> " + caractere);
        }
    }
}

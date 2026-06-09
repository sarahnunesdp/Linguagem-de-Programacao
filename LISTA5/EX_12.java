//SARAJ NUNES DO PRADO
//L5EX12

import java.util.Scanner;

public class ExercioLista {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double frete, valorFrete, valorFinal;
        String regiao;

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        System.out.print("Digite o valor do produto: ");
        double preco = sc.nextDouble();

        switch (codigo){
            case 1:
                frete = 0.1;
                regiao = "Norte";
                break;
            
            case 2, 5, 9:
                frete = 0.03;
                regiao = "Sul";
                break;

            case 3, 10, 11, 12, 13, 14, 15:
                frete = 0.012;
                regiao = "Leste";
                break;

            case 7,20:
                frete = 0.073;
                regiao ="Oeste";
                break;

            default:
                frete = 0.222;
                regiao = "Importado";
                break;
        }

        valorFrete = preco * frete;
        valorFinal = valorFrete+preco;

        System.out.println("============================");
        System.out.printf("Valor do produto: %.2f%n", preco);
        System.out.println("Região de procedência: " + regiao);
        System.out.printf("Valor do frete calculado: %.2f%n ", valorFrete);
        System.out.printf("Valor Final: %.2f%n", valorFinal);





      
       
    }
    
}

//SARAH NUNES DO PRADO
//L5EX07

import java.util.Scanner;

public class ExercioLista {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        double n1,n2, maior, menor;
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        if(n1>n2){
            maior=n1;
            menor=n2;
        }
        else{
            maior = n2;
            menor=n1;
        }

        System.out.printf ("Em ordem crescente: %.2f e %.2f", menor, maior);


    }
    
}

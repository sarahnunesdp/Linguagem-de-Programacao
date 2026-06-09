//SARAH NUNES DO PRADO
//L6EX17

import java.util.Scanner;

public class MediaAluno{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        double nota1, nota2, media;
        
        //valida nota1
        do{
            System.out.print("Informe a nota 1: ");
            nota1 = sc.nextDouble();
            
            if(nota1<0 || nota1>10){
                System.out.println("Valor inválido!Digite um valor de 0 a 10.");
            }
            
        }while(nota1<0 || nota1>10);
        
        //valida nota2
        do{
            System.out.print("Informe a nota 2: ");
            nota2 = sc.nextDouble();
            
            if(nota2<0 || nota2>10){
                System.out.println("Valor inválido!Digite um valor de 0 a 10.");
            }
            
        }while(nota2<0 || nota2>10);
        
        media = (nota1+nota2)/2;
        System.out.printf("A média final é %.2f ", media );
    }
}

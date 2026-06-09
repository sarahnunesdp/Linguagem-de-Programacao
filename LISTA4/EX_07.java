//SARAH NUNES DO PRADO
//L4EX07

import java.util.Scanner;
import java.util.Random;

public class Saudacao{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        Random random = new Random();
        
        int escolha = 0;
        int hora = 0;
        
        System.out.println("1: Informar a hora manualmente");
        System.out.println("2: Gerar uma hora aleatória");
        System.out.println("O que deseja fazer?");
        escolha  = sc.nextInt();
        
        //validar a resposta da escolha
        while (escolha<1 || escolha>2) {
            System.out.println("Opção inválida, digite o número 1 ou 2 de acordo com as opções");
            
            System.out.println("O que deseja fazer?");
            escolha  = sc.nextInt(); } 
        
        //opção1
        
        if(escolha == 1) {
            
            do{
                System.out.print("Informe a hora: ");
                hora = sc.nextInt();
            
                if(hora<0 || hora>23){
                    System.out.println("Valor inválido, digite um valor de hora entre 0 e 23!");
                }
            
            }while (hora<0 || hora>23);
        
        }
        
        //opcao2
        if(escolha==2){
            
            hora = random.nextInt(23);
            System.out.println("A hora é " + hora);
            
        }
        
        //mensagem das horas
        switch(hora){
            case 0,1,2,3,4,5,6:
                System.out.println("Zzzzz");
                break;
                
            case 7, 8, 9, 10, 11:
                System.out.println("Bom dia");
                break;
                
            case 12, 13, 14, 15, 16, 17:
                System.out.println("Boa tarde");
                break;
            
            case 18, 19, 20, 21, 22, 23:
                System.out.println("Boa noite");
                break;
        }
        
    }
}

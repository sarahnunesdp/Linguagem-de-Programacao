//SARAH NUNES DO  PRADO
//L4EX06

import java.util.Scanner;

public class ADivisivelPorB {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        int a =0;
        int b =0;
        
       
        
        do{
            System.out.print ("Digite o valor de a: ");
            a = sc.nextInt();
            
            if(a<0 || a>1000){
            System.out.println("Valor inválido, digite um número de 0 a 1000");
            }
            
        } while (a<0 || a>1000);
        
     
        do{
            System.out.print ("Digite o valor de b: ");
            b = sc.nextInt();
            
            if(b<0 || b>20){
            System.out.println ("Valor inválido, digite um número de 0 a 20");
            }
         } while (b<0 || b>2);
         
         
         if(1>b){
             System.out.println("O valor de 1 é maior que B");
         }
         if(1==b){
             System.out.println("O valor de B é igual a 1");
         }
         
         if(a%b==0){
             System.out.println("A é divisível por B");
         }
         else{
             System.out.println("A não é divisível por B");
         }
}
}

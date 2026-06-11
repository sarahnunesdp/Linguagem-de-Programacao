//SARAH NUNES DO PRADO
//L6EX20

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i, numero;
	    int menor = 1000000;
	    int maior = 0;
	    for(i=0;i<100;i++){
	        numero = sc.nextInt();
	        if(numero>maior){
	            maior=numero;
	        }
	        if(numero<menor){
	            menor=numero;
	        }
	    }
	    
	    System.out.println("MAIOR: " + maior);
	    System.out.println("MENOR: "+ menor);
	}
}

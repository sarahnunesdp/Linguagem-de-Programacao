//SARAH NUNES DO PRADO
//L6EX015


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int x, y, i, maior, menor;
	    int soma =0;
	  
	    x=sc.nextInt();
	    y=sc.nextInt();
	    
	    if(x>y){
	        maior = x;
	        menor = y;
	    }
	    else{
	        maior = y;
	        menor = x;
	    }
	    
	    
	    for(i=menor; i<=maior; i++){
	            soma = soma +i;
	        
	    }
	    
	    System.out.println("SOMA DOS INTEIROS: " + soma);
	}
}

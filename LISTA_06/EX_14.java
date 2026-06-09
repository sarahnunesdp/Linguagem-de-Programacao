//SARAH NUNES DO PRADO
//L6EX014


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int x, y, i;
	    int soma =0;
	    
	    
	    x=sc.nextInt();
	    y=sc.nextInt();
	    
	    for(i=x; i<=y; i++){
	            soma = soma +i;
	        
	    }
	    
	    System.out.println("SOMA DOS INTEIROS: " + soma);
	}
}

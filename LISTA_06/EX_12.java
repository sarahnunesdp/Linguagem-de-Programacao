//SARAH NUNES DO PRADO
//L6EX012


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i;
	    double n;
	    double soma =0;
	    
	    for(i=0; i<10; i++){
	        n=sc.nextDouble();
	        soma = soma + n;
	    }
	    System.out.println("SOMA: " + soma);
	    
	    
	   
	}
}

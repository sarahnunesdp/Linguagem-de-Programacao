//SARAH NUNES DO PRADO
//L6EX013


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i,n;
	    int soma =0;
	    
	    for(i=0; i<10; i++){
	        n=sc.nextInt();
	        if(n<40){
	            soma = soma + n;
	        }
	    }
	   System.out.println("SOMA : "+ soma);
	}
}

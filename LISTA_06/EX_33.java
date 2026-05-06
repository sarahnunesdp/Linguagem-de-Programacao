import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i, qtd;
	    
	    do{
	    System.out.print("Digite a quantidade de termos: ");
	    qtd = sc.nextInt();
	    } while(qtd<0);
	    
	
    	if(qtd==0){
    	   System.out.println("Programa Finalizado");
    	}
    	else{
    	   for (i=1; i<=qtd; i=i+2){
	       System.out.print(i+ " " );
	            }
    	    }
    	        
    	}
}

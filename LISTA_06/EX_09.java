import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i,numero;
	    int dentro = 0;
	    int fora = 0; 
	    
	    for(i=0; i<10;i++){
	        numero=sc.nextInt();
	        if(numero<10 || numero>20){
	            fora++;
	        }
	        else{
	            dentro++;
	        }
	    }
	    System.out.println ("Dentro: " +dentro);
	    System.out.println ("Fora: " +fora);
	    
	    
	}
}

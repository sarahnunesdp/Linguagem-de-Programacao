import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	        int i;
	        System.out.print("Número: ");
	        int n=sc.nextInt();
	        
	        int fatorial=1;
	        
	        for(i=1; i<=n; i++){
	        fatorial=fatorial*i;
	        System.out.println(i+"!="+fatorial);
	        
	    }
	    
	   
	    }
	    
    }

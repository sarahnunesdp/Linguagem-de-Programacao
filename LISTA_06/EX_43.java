import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i,n;
	    int cont = 0;
	    
	    while(cont<7){
	        int fatorial=1; //para resetar sempre, e não acumular.
	        
	        System.out.print("Número: ");
	        n=sc.nextInt();
	        
	        for(i=1; i<=n; i++){
	        fatorial=fatorial*i;
	        
	    }
	    System.out.println(n+"!="+fatorial);
	    cont++;
	    }
	    
    }
}

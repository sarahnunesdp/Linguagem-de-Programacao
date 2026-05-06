import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i, N;
	    int cont=0;
		  for(i=0; i<10; i++){
		    N=sc.nextInt();
		    if(N<0){
		        cont++;
		    }
		}
		System.out.println("Números negativos: " + cont);
		
	}
}

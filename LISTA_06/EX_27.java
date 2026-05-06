import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int i;
	    
	    for(i=1; i<=10; i++){
	        System.out.print(i+", ");
	        
	        for (int j=1; j<=11-i; j++){
	            System.out.print(j+" ");
	        }
	        System.out.println ();
	    }
	}
}

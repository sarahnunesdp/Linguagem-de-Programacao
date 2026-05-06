import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    int i;
	    
	    for(i=1; i<=10; i++){
	        System.out.print(i+", ");
	        
	        if(i%2 !=0) { //Impar
	            for (int j=1;j<=9; j=j+2){
	            System.out.print(j+" ");
	        }
	        }
	        else{ //par
	            for (int j=2; j<=10; j=j+2){
	            System.out.print(j+" ");
	            
	        }
	        
	  
	        }
	        System.out.println ();
	    }
	}
}

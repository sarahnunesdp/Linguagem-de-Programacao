import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i, qtd;
	    
	    System.out.print("Digite a quantidade de termos: ");
	    qtd = sc.nextInt();
	    
	    for(i=1; i<=qtd; i++){
	        System.out.print(i+ " " );
	    }
	}
}

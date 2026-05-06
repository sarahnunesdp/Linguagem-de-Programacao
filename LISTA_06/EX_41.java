import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int numero;
	    System.out.print("Digite o numero:");
	    numero=sc.nextInt();
	    
	    int fatorial = 1;
	    for(int i =1; i<=numero; i++){
	        fatorial = fatorial*i;
	    }
	    System.out.println(numero+"! = "+ fatorial);
	    
    }
}

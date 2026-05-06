import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int n, i;
	    int soma=0;
	    double media;
	    for (i=0; i<10; i++){
	        n = sc.nextInt();
	        soma = soma +n;
	    }
	    
	    media = (double) soma / 10.0;
	    System.out.println("A MEDIA É: " + media);
	    
	}
}

/*
 * LISTA 07, EX5
 */
import java.util.Scanner;

public class Exercicio01 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String frase;
		
		char letra = 'a';
		int contador =0;
		
		System.out.print ("Entre com uma frase: ");
		frase=sc.nextLine();
		
		frase.toLowerCase();
		
		for(int i =0; i<frase.length(); i++) {
				if (frase.charAt(i) == letra) {
					contador ++;
					}
		}
		
		System.out.println ("A letra " + letra + " apareceu " + contador + " vezes");
	}
}


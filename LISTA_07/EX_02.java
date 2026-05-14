/*
 * LISTA 07, EX2
 */


public class Exercicio01 {
	
	public static void main (String[] args) {
		
		String alfabeto = "";
		
		char letra = 'A';
		
		for(int i=0; i<26; i++) {
			alfabeto = alfabeto +(char)(letra+i);
		}
		System.out.println(alfabeto);
	}
}


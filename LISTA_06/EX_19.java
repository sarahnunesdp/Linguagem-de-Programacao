//SARAH NUNES DO PRADO
//L6EX19

import java.util.Scanner;

public class Mercadoria {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nTotal;
		double valor, media;
		double valorTotal=0;
		char resposta;
		
		
		do{
			
			System.out.print("Valor mercadoria: ");
			valor =sc.nextDouble();
			
			valorTotal = valorTotal+ valor;
			
			System.out.printf("Deseja continuar?(S/N): ");
			resposta = sc.next().charAt(0);
			
			} while(resposta == 'S');
		
		media = (double) valorTotal/nTotal;
		
		System.out.printf("Valor total em estoque: R$ %.2f%n", valorTotal);
		System.out.printf("Média: R$ %.2f", media);
		
		
	}
}


//SARAH NUNES DO PRADO
//L6EX18

import java.util.Scanner;

public class Mercadoria {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int nTotal, i;
		double valor, media;
		double valorTotal=0;
		
		System.out.print("Número total de mercadorias em estoque: ");
		nTotal = sc.nextInt();
		
		for (i=1; i<=nTotal; i++){
			
			System.out.print("Valor mercadoria: ");
			valor =sc.nextDouble();
			
			valorTotal = valorTotal+ valor;
			}
		
		media = (double) valorTotal/nTotal;
		
		System.out.printf("Valor total em estoque: R$ %.2f%n", valorTotal);
		System.out.printf("Média: R$ %.2f", media);
		
		
	}
}


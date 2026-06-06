//SARAH NUNES DO PRADO
//L4EX04

import java.util.Scanner;

public class Nota{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		
		double precoProduto1, precoProduto2;
		
		System.out.print("Digite o preço do produto 1: ");
		precoProduto1 = sc.nextInt();
		
		System.out.print("Digite o preço do produto 2: ");
		precoProduto2= sc.nextInt();
		
		if  (precoProduto1<1 || precoProduto1>1000) {
			System.out.println("Valor Inválido");}
		
		if  (precoProduto2<1 || precoProduto2>1000) {
			System.out.println("Valor Inválido");}
			
			else{
				if(precoProduto1<precoProduto2){
					System.out.println("O produto 1 é mais barato que o produto 2");}
					else{
						System.out.println("O produto 2 é mais barato que o produto 1");}}

}
}

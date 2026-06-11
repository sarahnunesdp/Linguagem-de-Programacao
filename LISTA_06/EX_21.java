import java.util.Scanner;

public class Mercadoria {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int numero, maior, i, qtd;
		int soma =0;
		double media;
		
		System.out.print("Digite a quantidade de números: ");
		qtd = sc.nextInt();
		
		numero = 0;
		maior = 0 ;
		
		for(i=1; i<=qtd;i++){
			
			System.out.print("Digite o número: ");
			numero = sc.nexInt();
			
			if (numero>maior){
				maior=numero;
				
			}
			
			soma = soma + numero;
			
			}
			
		media = (double) soma/qtd;
		
		System.out.println ("O maior número é: " + maior);
		System.out.printf("A média dos números é: %.2f%n", media);
		
		
	}
}


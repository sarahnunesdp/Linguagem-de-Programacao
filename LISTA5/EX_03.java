//SARAH NUNES DO PRADO
//L5EX03

import java.util.Scanner;

public class Calcular{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
			int qtd;
			double valorU, valorFinal;
			
			System.out.print("Digite a quantidade de maçãs: ");
			qtd = sc.nextInt();
			
			if(qtd<12) {
				valorU = 1.30;
			}
			else{
				valorU = 1.00;
				}
			
			valorFinal = qtd * valorU;
			System.out.printf("Valor Final: %.2f", valorFinal);
			
		sc.close();
		
		
		}
	
	}

import java.util.Scanner;

public class MaiorMenor{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
			double valor1,valor2;
			
			System.out.print("Digite o valor 1: ");
			valor1 = sc.nextDouble();
			
			System.out.print("Digite o valor 2: ");
			valor2 = sc.nextDouble();
			
			if(valor1>valor2){
				System.out.printf("O valor 1: %.2f é o MAIOR número", valor1);
				}
			else{
				System.out.printf("O valor 2: %.2f é o MAIOR número", valor2);
				}	
		sc.close();
			
	}	
}

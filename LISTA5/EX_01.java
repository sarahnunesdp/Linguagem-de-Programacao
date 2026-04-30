import java.util.Scanner;

public class Calcular{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
			double numero;
			System.out.print("Digite um número: ");
			numero = sc.nextDouble();
			
			if (numero>10) {
				System.out.println("É maior que 10!");
				}
			
			else{
				System.out.println("Não é maior que 10!");
				}
			
		sc.close();
		
		
		}
	
	}

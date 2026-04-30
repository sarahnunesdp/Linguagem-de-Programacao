import java.util.Scanner;

public class Calcular{
	public static void main (String[]args){
		
		Scanner sc = new Scanner(System.in);
		
			double numero;
			System.out.print("Digite um número: ");
			numero = sc.nextDouble();
			
			if (numero < 0) {
				System.out.printf("%.2f e negativo!", numero);
				}
			
			else{
				System.out.printf("%.2f e positivo!" , numero);
				}
			
		sc.close();
		
		
		}
	
	}

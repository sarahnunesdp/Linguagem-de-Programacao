import java.util.Scanner;

public class SegundoGrau {
	public static void main (String [] args) {
		Scanner sc = new Scanner (System.in);
		
			double raiz1, raiz2;
		
			System.out.print ("Digite o valor de a: ");
			double a = sc.nextDouble();
			
			if (a==0) {
				System.out.println ("Não é uma equação do segundo grau");
			}
			
			else{
			
				System.out.print ("Digite o valor de b:");
				double b = sc.nextDouble();
				
				System.out.print ("Digite o valor de c:");
				double c = sc.nextDouble();
				
				System.out.println();
				
				double delta = (Math.pow(b, 2) ) - ( 4 * a * c);
				System.out.println("Delta: " +delta);
				System.out.println();
				
		
				
				if (delta<0) {
					System.out.println("Não é possível calcular");
				}
				
				else{
					if (delta==0){
						 raiz1 = ( (-b) + Math.sqrt(delta) ) / (2*a);
						 System.out.println("Valor da raiz: "  + raiz1);
						}
						
					else{ 
						raiz1 = ( (-b) + Math.sqrt(delta) ) / (2*a);
						raiz2 = ( (-b) - Math.sqrt(delta) ) / (2*a);
						System.out.println("Valor da raiz 1: "  + raiz1);
						System.out.println();
						System.out.println("Valor da raiz 2: "  + raiz2);
						}
					}
			}
		
		sc.close();
			
	}
}
		






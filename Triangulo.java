import java.util.Scanner;

public class Triangulo {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double a, b, c;
		System.out.println ("Digite o lado a:");
		a = sc.nextDouble();
		
		System.out.println ("Digite o lado b:");
		b = sc.nextDouble();
		
		System.out.println ("Digite o lado c:");
		c = sc.nextDouble();
		
		
		//verificar se os lados formam um triangulo
		if ( !(a+b>c || a+c>b || c+b>a)) { 
			System.out.println("Não é um trinagulo");
		}
		
		else {
			if(a==b && b==c){
				System.out.println("É um triângulo equilátero");
				}
			else{
				if(
				
				}
			
			
			
			
			}
		
		
		
		
		
		
		
		
	}
}


import java.util.Scanner;

public class Media{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
		double nota1,nota2,media;
		
		System.out.print("Digite a nota 1: ");
		nota1 = sc.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		nota2 = sc.nextDouble();
		
		System.out.println();
		media = (nota1+nota2)/2;
		
		if(media>=6){
			System.out.println("APROVADO!");
			}
		else{
			System.out.println ("REPROVADO");
			}
		System.out.println();
		System.out.printf("Media Final: %.2f", media);
		
		
	}	
}

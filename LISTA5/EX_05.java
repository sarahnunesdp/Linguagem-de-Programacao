import java.util.Scanner;

public class Media{
	public static void main (String[]args){
		Scanner sc = new Scanner(System.in);
		
			int anoAtual, anoNasc, idade;
			anoAtual = 2026;
			System.out.print("Digite o ano de seu nascimento: ");
			anoNasc = sc.nextInt();
			idade = anoAtual - anoNasc;
			
			if(idade>=17){
				System.out.println("Pode votar esse ano!'");
				}
			else{
				System.out.println("Não pode votar esse ano!");
				}
				
		sc.close();
			
	}	
}

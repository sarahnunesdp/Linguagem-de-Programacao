import java.util.Scanner;

public class sem titulo {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tabuada, numero=0, resultado;
		System.out.println("Entre com a tabuada: ");
		tabuada = sc.nextInt();
		
		
		while (numero<=10){
			resultado = tabuada *numero;
			System.out.println ("%2d x %2d = %2d/n", tabuada, numero, resultado);
			
			numero++;
			}

    
		do{
			resultado = tabuada *numero;
			System.out.println ("%2d x %2d = %2d/n", tabuada, numero, resultado);
			
			numero++;
			} while (numero<=10);
			
			
		for (numero=0; numero<=10; numero++){
			resultado = tabuada *numero;
			System.out.println ("%2d x %2d = %2d/n", tabuada, numero, resultado);
			} 
		
		
	}
}


//SARAH NUNES DO PRADO
//L5EX011

import java.util.Scanner; 

public class Salario {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		  double valor1, valor2, resultado;
		  char operacao;
		  
		  System.out.print("Digite o valor 1: ");
		  valor1 = sc.nextDouble();
		  
		  System.out.print("Digite o valor 2: ");
		  valor2 = sc.nextDouble();
		  
		  System.out.print ("Digite a operação desejada: ");     
		  operacao = sc.next().charAt(0);
		  
		  switch(operacao){
			  case '+':
			  resultado = valor1+valor2;
			  break;
			  
			  case '-': 
			  resultado = valor1-valor2;
			  break;
			  
			  case '*':
			  resultado = valor1*valor2;
			  break;
			  
			  case '/':
			  if (valor1>valor2){
				    resultado = valor1/valor2;
				  }
			  else{
				    resultado = valor2/valor1;
				  }
			
			  break;
			  
			  default:
				System.out.println ("Impossivel Calcular");
			  }
			  
		System.out.println ("O resultado da operação é de %.2f", resultado);
		  
		  
		  
	}
}

//SARAH NUNES DO PRADO
//L4EX02

import java.util.Scanner;

public class Nota{
	public static void main (String[]args){
		Scanner sc = new Scanner (System.in);
		
		double nota;
		System.out.print("Insira a nota do aluno: ");
		nota = sc.nextDouble ();
		
		if (nota<0 || nota>10){
			System.out.print("Nota Invalida");
		}
		
		else{
			
			if(nota<6){
				System.out.print("Reprovado");}
				
				else{
					System.out.print("Aprovado");}
			
		
		}
    
	}

}


/*
LISTA 5 - EX 9
 */

import java.util.Scanner; 

public class Salario {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double horaExtra, valorHoraExtra;
		
		
		System.out.print ("Digite as horas trabalhadas no mês: ");
		double horas = sc.nextDouble();
		
		System.out.print ("Digite o salário por hora: ");
		double salarioHora = sc.nextDouble();
		
		double salario = horas * salarioHora;
		
		if (horas > 160){
			
			horaExtra = horas - 160;
			valorHoraExtra = horaExtra * (salarioHora+ (0.5*salarioHora));
			
			salario = salario + valorHoraExtra;
			}
		
		System.out.printf ("O salário total é de R$ %.2f" , salario);
		
		
	}
}


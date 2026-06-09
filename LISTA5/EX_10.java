//SARAH NUNES DO PRADO
//L5EX010

import java.util.Scanner; 

public class Salario {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salarioFixo, valorVendas, salarioFinal, extra;
		
		System.out.println ("Digite o salário fixo: ");
		salarioFixo = sc.nextDouble();
		
		System.out.println ("Digite o valor das vendas efetuadas");
		valorVendas = sc.nextDouble();
		
		if(valorVendas <= 1500) {
			extra = 0.3 * 1500;
			salarioFinal = salarioFixo + extra;
			}
		else {
			extra = 0.5*valorVendas;
			salarioFinal = salarioFixo + extra;
	}
	
	System.out.printf (" O salário final é de R$ %.2f ", salarioFinal);
}
}


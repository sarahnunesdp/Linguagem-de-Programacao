import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	    int i, j;
	    int cont=0;
	    
	    System.out.print("Digite a quantidade de termos: ");
	    int qtd = sc.nextInt();
	    
	    int qtd2 = qtd;
	    int fatorial=1;
	    
	    for(i=qtd; i>=1; i--){ //controla a quantidade de temos
        
	        for(j=qtd2; j>=1; j--){ //controla o cálculo
	        fatorial=fatorial*j;
	        }
	        
	        System.out.println(i+"!="+fatorial);
	        fatorial=1; //zera o fatorial, para não acumular
	        qtd2 -= 1; //decremento para calcular o próximo número
	    }
	     
	   
	    }
	    
    }

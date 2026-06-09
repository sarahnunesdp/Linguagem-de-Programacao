//SARAH NUNES DO PRADO
//L6EX011


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
	   int alunos, i;
	   double nota1, nota2, media;
	   
	   System.out.print("QUANTIDADE DE ALUNOS: ");
	   alunos = sc.nextInt();
	   
	   for(i=0; i<alunos; i++){
	       nota1 = sc.nextDouble();
	       nota2 = sc.nextDouble();
	       media= (nota1+nota2)/2;
	       System.out.println("MEDIA: "+ media);
	   }
	}
}

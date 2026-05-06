import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    
		int N, i;
		int produto=0;
		do{
		    N=sc.nextInt();
		}while(N<1||N>10);
		
		for(i=1; i<=10; i++){
		    produto=i*N;
		    System.out.println(i+" x "+N+" = "+produto);
		}
		
	}
}

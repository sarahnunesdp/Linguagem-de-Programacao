import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     int N, i;
     
     do{
        System.out.print("Digite um número: ");
        N = sc.nextInt();
     } while(N<0);
     
     for(i=1; i<=N; i++){
       System.out.println(i);
     }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     
     int i;
     int produto=0;
     int numero=8; 
     
     for(i=1; i<=10; i++){
         produto = i*numero;
         System.out.println(i+" x " + numero+" = "+produto);
         
         
     }
    
    }
}

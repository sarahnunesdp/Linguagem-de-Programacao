import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número : ");
        int number = sc.nextInt();

        if (number <= 1) { //numeros<=1 não sao primos
            System.out.println(number + " não é um número primo.");
        } 
          
        else {
            boolean ePrimo = true; //acompanhar se o numero é primo
            for (int i = 2; i < number; i++) { //procurar possiveis divisores fora o 1 e o n
            
                if (number % i == 0) {
                    ePrimo = false;
                    break; //sai do loop
                }
              
            }

            if (ePrimo) {
                System.out.println(number + " é um número primo.");
            } else {
                System.out.println(number + " não é um número primo.");
            }
        }

        sc.close();
    }
}

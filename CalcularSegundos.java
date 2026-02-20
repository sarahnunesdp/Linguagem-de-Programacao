import java.util.Scanner;

public class Main{
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int hora, minuto, segundosTotal;

        System.out.print("Digite as horas: ");
        hora = sc.nextInt();
        System.out.print("Digite os minutos: ");
        minuto = sc.nextInt();
        System.out.println();

        segundosTotal = (hora*3600) + (minuto*60);
        System.out.printf("%d:%d correspondem a %d segundos", hora, minuto, segundosTotal);

        sc.close();
    }
}

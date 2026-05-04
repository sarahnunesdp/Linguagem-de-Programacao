import java.util.Scanner;

public class ExercioLista {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        int h1, h2, tempofinal;

        System.out.print("Digite a hora de início: ");
        h1 = sc.nextInt();
        System.out.print("Digite a hora de início: ");
        h2 = sc.nextInt();

        tempofinal = h2-h1;

        System.out.print ("A duração do jogo foi de " +tempofinal+" horas");
       
       


    }
    
}

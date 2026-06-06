//SARAH NUNES DO PRADO
//L4EX05

public class ADivisivelPorBRandom {
    public static void main (String [] args){
        
        int a = (int) (Math.random() * 1000);
        int b = (int) (Math.random() * 20);
        
        System.out.println ("A: " + a);
        System.out.println ("B: " + b);
        
        if (a%b == 0){
            System.out.println ("A é divisivel por B");
        }
        else{
            System.out.println ("A não é divisível por B");
        }
    }
}

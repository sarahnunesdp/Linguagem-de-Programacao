//SARAH NUNES DO PRAD0
//L4EX01

public class AprovadoReprovadoRandom{
    public static void main (String [] args){
        
         double nota=Math.random() * 10;
         
         System.out.printf ("Nota: %.2f%n", nota);
      
          if (nota<6){
              System.out.println ("REPROVADO");
          }
          else {
              System.out.println ("APROVADO");
          }
    }
}

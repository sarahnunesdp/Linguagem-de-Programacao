//SARAH NUNES DO PRADO
//L6EX16

public class MediaAritimetica {
    public static void main (String [] args){
        
        int i,j;
        int soma =0;
        double media;
        j=0;
        
        for(i=15; i<=100; i++){
            soma = soma+i;
            j++;
        }
        
        media =(double)soma/j;
        
        System.out.printf("A média da soma de 15 a 100 é %.2f ", media);
    }
}

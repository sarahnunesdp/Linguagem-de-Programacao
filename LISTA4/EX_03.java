//SARAH NUNES DO PRADO
//L4EX03

public class VerificaValorProdutoRandom{
    public static void main (String [] args){
        
         double precoProduto1 =(Math.random() * 1000) + 1;
         double precoProduto2 =(Math.random() * 1000) + 1;
         
         System.out.printf ("Preço Produto1 %.2f%n", precoProduto1);
         System.out.printf ("Preço Produto2 %.2f%n", precoProduto2);
        
        
             if (precoProduto1==precoProduto2){
                System.out.println("O preço dos dois produtos são iguais");
             }
                
            else{
                if (precoProduto1>precoProduto2){
                    System.out.println("O preço do Produto 1 é maior que o preço do Praduto 2");
                }
               else{
                System.out.println("O preço do Produto 2 é maior que o preço do Praduto 1");
               }
                
            } 
            
         
         
         
    }
}

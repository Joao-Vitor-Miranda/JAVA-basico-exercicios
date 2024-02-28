import java.util.Scanner;
public class Joao30{
   public static void main (String []args){
   double fixo=200,lucro,lucroM=0,qtIm=0,pIm=0;
   System.out.println("Ingressos\tvalor\tlucro");
   for (double preco=5,ing=120;preco>=1;preco-=0.5,ing+=26){
      lucro=ing*preco-fixo;
      System.out.println(ing+"\t \t\t"+preco+"\t"+lucro);
         if(lucro>lucroM){
            lucroM=lucro;
            qtIm=ing;
            pIm=preco;
         }
   }
   System.out.println("o lucro maximo sera"+lucroM+"vendendo"+qtIm+"ingressos"+"valor de R$:"+pIm);
 }
}

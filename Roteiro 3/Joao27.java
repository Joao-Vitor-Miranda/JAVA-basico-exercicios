import java.util.Scanner;
public class Joao27{
   public static void main (String []args){
   int L,i,aux=0,ii;
   String l="#";
    Scanner ler = new Scanner (System.in);
      System.out.println("Digite o número de linha:");
      L=ler.nextInt();
      for(i=1;i<=L;i++){
        System.out.println(" "+l);
        aux++;
        if(aux<L){
         for(ii=0;ii<aux;ii++){
            System.out.print(" "+l);
        }
       }
      } 
   }
}

import java.util.Scanner;
public class Joao28{
   public static void main (String []args){
   int n,i,ii,x=0,y=0,R;
    Scanner ler = new Scanner (System.in);
      System.out.println("Digite um número:");
      n=ler.nextInt();
      for(i=1;i<=n;i++){
       x++;
         for(ii=0;ii<=10;ii++){
         R=x*y;
         System.out.print(x+"x"+y+"="+R+"  ");
         y++;
         }
      y=0;
      System.out.println(" ");
      } 
   }
}

/*Implemente um programa que solicite um valor inteiro positivo (N) ao usuário. Após isso imprima a
tabuada dos números de 1 à N.*/
import java.util.Scanner;
public class Joao20{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int n1,n2;
   System.out.println("Digite dois numero:");
   n1=ler.nextInt();
   n2=ler.nextInt();
   
      if(n1%n2==0)
      System.out.printf("%d e multiplo de %d",n1,n2);
      else
      System.out.printf("%d não e multiplo de %d",n1,n2);
   }
}
/*Elabore um programa que realize o mesmo procedimento do fluxograma abaixo. A função mod utilizada
no fluxograma representa o resto da divisão interia.*/
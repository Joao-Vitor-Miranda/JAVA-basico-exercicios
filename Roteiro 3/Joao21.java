import java.util.Scanner;
public class Joao21{
   public static void main (String []args){
   int n, d, n_aux,inverso=0;
    Scanner ler = new Scanner (System.in);
      System.out.println("Digite um n�mero:");
      n=ler.nextInt();
      n_aux = n;
      while (n>0){
         d = n%10;
         n = n/10;
         inverso=inverso*10+d;
   }
      if(n_aux==inverso)
      System.out.println("� PAL�NDROMO");
      else
      System.out.println("N�O E PAL�NDROMO");
      
 }
}




/*Implemente um programa que receba de entrada um n�mero inteiro qualquer, ap�s isso verifique se o
n�mero inserido � ou n�o um PAL�NDROMO, ou seja, o n�mero � o mesmo tanto de visto da direita para
esquerda quanto da esquerda para a direita. Ex: 121, 1441, 34643, etc. N�o utilize fun��es pr�-definidas
no JAVA.*/
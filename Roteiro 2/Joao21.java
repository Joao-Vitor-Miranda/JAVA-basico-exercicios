import java.util.Scanner;
public class Joao21{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int ano;
   System.out.println("Digite um ano:");
   ano=ler.nextInt();
   
      if(ano%4==0 && ano%100!=0 ||ano%400==0)
      System.out.printf("%d � um ano bissexto",ano);
      else
      System.out.printf("%d N�o e um ano bissexto",ano);
   }
}
/* Implemente um programa que receba um n�mero inteiro positivo representando um ano qualquer e
imprima se o ano � bissexto ou n�o. Um ano bissexto � definido quando: (ano % 4 = 0 e (ano % 100 != 0
ou ano % 400 == 0)).*/
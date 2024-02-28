import java.util.Scanner;
public class Joao21{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int ano;
   System.out.println("Digite um ano:");
   ano=ler.nextInt();
   
      if(ano%4==0 && ano%100!=0 ||ano%400==0)
      System.out.printf("%d É um ano bissexto",ano);
      else
      System.out.printf("%d Não e um ano bissexto",ano);
   }
}
/* Implemente um programa que receba um número inteiro positivo representando um ano qualquer e
imprima se o ano é bissexto ou não. Um ano bissexto é definido quando: (ano % 4 = 0 e (ano % 100 != 0
ou ano % 400 == 0)).*/
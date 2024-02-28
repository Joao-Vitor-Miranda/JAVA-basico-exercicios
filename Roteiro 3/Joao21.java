import java.util.Scanner;
public class Joao21{
   public static void main (String []args){
   int n, d, n_aux,inverso=0;
    Scanner ler = new Scanner (System.in);
      System.out.println("Digite um número:");
      n=ler.nextInt();
      n_aux = n;
      while (n>0){
         d = n%10;
         n = n/10;
         inverso=inverso*10+d;
   }
      if(n_aux==inverso)
      System.out.println("É PALÍNDROMO");
      else
      System.out.println("NÂO E PALÍNDROMO");
      
 }
}




/*Implemente um programa que receba de entrada um número inteiro qualquer, após isso verifique se o
número inserido é ou não um PALÍNDROMO, ou seja, o número é o mesmo tanto de visto da direita para
esquerda quanto da esquerda para a direita. Ex: 121, 1441, 34643, etc. Não utilize funções pré-definidas
no JAVA.*/
import java.util.Scanner;
public class Joao9{
   public static void main (String []args){
   int i=1;
   double sm=0,n=0,md=0;
    Scanner ler = new Scanner (System.in);
      System.out.println("Digite um numero: ");
      n=ler.nextDouble();
      
      while (i<=n){
      sm+=i;
      md=sm/n;
      i++;
   }
  System.out.println("A soma é: "+sm+"A media é: "+md);
 }
}/*Faça um programa que calcule e imprima a soma e a média de N números digitados pelo usuário. O valor
de N deve ser fornecido pelo usuário.*/
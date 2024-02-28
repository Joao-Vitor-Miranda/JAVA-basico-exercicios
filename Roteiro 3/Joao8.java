import java.util.Scanner;
public class Joao8{
   public static void main (String []args){
   int i=1;
   double sm=0,n=0;
    Scanner ler = new Scanner (System.in);
      System.out.println("Digite um numero: ");
      n=ler.nextDouble();
      
      while (i<=n){
      if (i%2==0){
      sm-=1.0/i;
      i++;
      }
      else{
      sm+=1.0/i;
      i++;
      }

   }
  System.out.println("A soma é: "+sm);
 }
}
/*Faça um algoritmo que imprima a soma da sequência apresentada: H = 1 - 1/2 + 1/3 – 1/4 + 1/5... 1/N. O
valor de N deve ser positivo e fornecido pelo usuário.*/
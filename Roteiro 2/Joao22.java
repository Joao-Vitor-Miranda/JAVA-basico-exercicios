import java.util.Scanner;
public class Joao22{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int n1,n2,n3;
   System.out.println("Digite três numeros:");
   n1=ler.nextInt();
   n2=ler.nextInt();
   n3=ler.nextInt();
   
      if(n1<n2 && n1<n3){
         if(n2<n3)
         System.out.printf("ordem crescente: %d,%d e %d\ndecrescente: %d,%d e %d",n1,n2,n3,n3,n2,n1);
         else 
         System.out.printf("ordem crescente: %d,%d e %d\ndecrescente: %d,%d e %d",n1,n3,n2,n2,n3,n1);
      }
      else if(n2<n1 && n2<n3){
         if(n1<n3)
         System.out.printf("ordem crescente: %d,%d e %d\ndecrescente: %d,%d e %d",n2,n1,n3,n3,n1,n2);
         else 
         System.out.printf("ordem crescente: %d,%d e %d\ndecrescente: %d,%d e %d",n2,n3,n1,n1,n3,n2);
      }    
      else {
         if(n1<n2)
         System.out.printf("ordem crescente: %d,%d e %d\ndecrescente: %d,%d e %d",n3,n1,n2,n2,n1,n3);
         else 
         System.out.printf("ordem crescente: %d,%d e %d\ndecrescente: %d,%d e %d",n3,n2,n1,n1,n2,n3);
         }
   }
}
/*Faça um algoritmo que receba três números e mostre-os em ordem crescente e decrescente.*/
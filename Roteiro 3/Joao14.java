import java.util.Scanner;
public class Joao14{
   public static void main (String []args){
   int n,i,R=0;
    Scanner ler = new Scanner (System.in);
      System.out.print("Digite o Fatorial: ");
      n=ler.nextInt();
      for(i=1;i<=n;i++){
      if(i==1){
      R=n;
      n--;
      R=R*n;
      }
      else{
      n--;
      R=R*n;
      }
      }
      System.out.print(R);
      }    
    }             
/*Faça um programa que calcule e imprima o fatorial do valor N. O valor de N será fornecido de entrada
pelo usuário. O fatorial de um número positivo N qualquer (representado por N!) é o produto de todos os
inteiros positivos menores ou iguais à N, ou seja, Fatorial (N) = 1 * 2 * 3 * ... * N. Por exemplo, o
fatorial de 5 = 1*2*3*4*5 = 120.*/
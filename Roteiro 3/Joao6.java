import java.util.Scanner;
public class Joao6{
   public static void main (String []args){
   int i=1,sm=0,md=0;
   
      while (i<=100){
      sm=sm+i;
      i++;
   }
   md=sm/100; 
   System.out.println("Soma:"+sm); 
   System.out.println("Media:"+ md); 
 }
}

/*Faça um programa que calcule e imprima a soma e a média dos N primeiros números positivos. Soma = 1
+ 2 + 3 + ... + N*/
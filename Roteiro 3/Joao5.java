import java.util.Scanner;
public class Joao5{
   public static void main (String []args){
   int i=1,sm=0,md=0;
   
      while (i<=10){
      sm=sm+i;
      i++;
   }
   md=sm/10; 
   System.out.println("Soma:"+sm); 
   System.out.println("Media:"+ md); 
 }
}

/*Faça um programa que calcule e imprima a soma e a média dos 10 primeiros números positivos. Soma =
1 + 2 + 3 + ... + 10*/
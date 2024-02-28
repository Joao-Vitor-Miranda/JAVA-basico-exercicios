import java.util.Scanner;
public class Joao15{
   public static void main (String []args){
   int n,aux,x=0,y=1;
    Scanner ler = new Scanner (System.in);
      System.out.print("Digite os N primeiros termos da serie de Fibonacci: ");
      n=ler.nextInt();
      for(int i=1;i<=n;i++){
      aux=x;
      x=x+y;
      y=aux;
      System.out.println(x);

      }
            }    
    } 
/*Faça um programa em JAVA que imprima os N primeiros termos da serie de Fibonacci. Sabe-se que N é
fornecido pelo usuário. Fibonacci = 1, 1, 2, 3, 5, 8, 13, 21, ...*/
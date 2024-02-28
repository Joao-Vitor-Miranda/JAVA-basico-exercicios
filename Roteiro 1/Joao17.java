import java.util.Scanner;
public class Joao17{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   
   float num;
   System.out.println("Quantos minutos:");
   num=ler.nextFloat();
   
   System.out.printf("inteira:%.0f\nfracionária:%.2f",num,num);
   } 
}
/*
Faça um programa que receba de entrada um número real, encontre e mostre:
a. A parte inteira desse número;
b. A parte fracionária desse número.
*/
import java.util.Scanner;
public class Joao17{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   
   float num;
   System.out.println("Quantos minutos:");
   num=ler.nextFloat();
   
   System.out.printf("inteira:%.0f\nfracion�ria:%.2f",num,num);
   } 
}
/*
Fa�a um programa que receba de entrada um n�mero real, encontre e mostre:
a. A parte inteira desse n�mero;
b. A parte fracion�ria desse n�mero.
*/
import java.util.Scanner;
public class Joao18{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   
   double sal,w,des,pago,kw;
   System.out.println("valor do sal�rio m�nimo");
   sal=ler.nextFloat();
   System.out.println("quantidade de quilowatt consumida");
   w=ler.nextFloat();
   
   pago=0.2*sal;
   kw=pago*w;
   des=kw-(kw*0.15);
   
   System.out.printf("O valor pago por quilowatt:%.2f\nO valor a ser pago pelo consumo nessa resid�ncia:%.2f\nO valor a ser pago considerando o desconto:%.2f",pago,kw,des);
   } 
}

/*
Sabe-se que o valor pago por quilowatt de energia custa um quinto do valor do sal�rio m�nimo. Fa�a um
algoritmo que receba o valor atual do sal�rio m�nimo e a quantidade de quilowatt consumida em uma
resid�ncia, calcule e mostre:
a. O valor pago por quilowatt;
b. O valor a ser pago pelo consumo nessa resid�ncia;
c. O valor a ser pago considerando um desconto de 15%.
*/
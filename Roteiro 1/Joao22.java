import java.util.Scanner;
public class Joao22{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   
   int a,b,aux;
   
   System.out.println("Entre com o valor A em seguida com o B:");
   a=ler.nextInt();
   b=ler.nextInt();
   
   aux=a;
   a=b;
   b=aux;
   
   System.out.printf("A=%d B=%d",a,b);
   
   } 
}
/*Fa�a um algoritmo que leia dois valores num�ricos e armazene nas vari�veis A e B, ap�s isso, efetue a
troca dos valores de forma que A passe a possuir o valor de B e B passe a possuir o valor de A. Imprima os
valores ap�s troca.*/
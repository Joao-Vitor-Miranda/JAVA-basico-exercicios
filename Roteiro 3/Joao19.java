import java.util.Scanner;
public class Joao19{
   public static void main (String []args){
   int num,i=0;
   double sm=0,media;
    Scanner ler = new Scanner (System.in);

      do{
      System.out.println("Digite n�meros para fazer a media(encerra digitando -1)");
      num=ler.nextInt(); 
      if(num!=-1){
      sm+=num;
      i++;
      }
      }
      while(num!=-1);
      media=sm/i;
      System.out.println(media);

  }    
} 
/*Fa�a um programa que deve solicitar n�meros para o usu�rio at� que seja digitado -1. Quando o usu�rio
digitar -1, o programa termina e imprime a m�dia de todos os n�meros positivos digitados.*/
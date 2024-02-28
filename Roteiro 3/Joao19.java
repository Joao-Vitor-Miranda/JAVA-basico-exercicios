import java.util.Scanner;
public class Joao19{
   public static void main (String []args){
   int num,i=0;
   double sm=0,media;
    Scanner ler = new Scanner (System.in);

      do{
      System.out.println("Digite números para fazer a media(encerra digitando -1)");
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
/*Faça um programa que deve solicitar números para o usuário até que seja digitado -1. Quando o usuário
digitar -1, o programa termina e imprime a média de todos os números positivos digitados.*/
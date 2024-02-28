import java.util.Scanner;
public class Joao16{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   
   int minuto,Minutos,hora;
   System.out.println("Quantos minutos:");
   minuto=ler.nextInt();
   
   hora=minuto/60;
   Minutos=minuto%60;
   System.out.printf("%dHora%dMinutos",hora,Minutos);
   } 
}
/*
Faça um algoritmo que receba uma quantidade qualquer em minutos e converta em horas e minutos (utilize
divisão inteira e resto da divisão inteira).
*/
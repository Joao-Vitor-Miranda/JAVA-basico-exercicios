import java.util.Scanner;
public class Joao10 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float val,i,t,M1;
   double M2,Mf;
   System.out.println("Digite o valor:");
   val=ler.nextFloat();
   System.out.println("Digite o rendimento:");
   i=ler.nextFloat();
   System.out.println("Digite o tempo:(mês)");
   t=ler.nextFloat();
   
   M1=1+(i/100);
   M2=Math.pow(M1,t);
   Mf=val*M2;
   System.out.printf("Total acumulado é:%.2f",Mf);
   }
}
/*
Uma pessoa depositou R$2000,00 em um fundo de investimento que rende 0.5% ao mês. Essa pessoa
gostaria de saber qual o total acumulado após 2 anos. Faça um programa que forneça tais informações.
(Obs. desconsidere correção monetária e utilize a fórmula de juros compostos.R:
*/
import java.util.Scanner;
public class Joao4{
   public static void main (String []args){
   int i=0;
   Scanner ler = new Scanner (System.in);
   do
   {
   System.out.print("Digite um número (encerrar ao ser digitado o número -999):");
   i=ler.nextInt();
      if(i!=-999){
      System.out.println(i=3*i);
      }
   }
   while (i!=-999);   
 }
}
/*Escreva um algoritmo que receba números do usuário e imprima o triplo de cada número. O algoritmo
deve encerrar ao ser digitado o número –999. Obs.: O triplo de -999 não deve ser exibido.*/

import java.util.Scanner;
public class Joao4{
   public static void main (String []args){
   int i=0;
   Scanner ler = new Scanner (System.in);
   do
   {
   System.out.print("Digite um n�mero (encerrar ao ser digitado o n�mero -999):");
   i=ler.nextInt();
      if(i!=-999){
      System.out.println(i=3*i);
      }
   }
   while (i!=-999);   
 }
}
/*Escreva um algoritmo que receba n�meros do usu�rio e imprima o triplo de cada n�mero. O algoritmo
deve encerrar ao ser digitado o n�mero �999. Obs.: O triplo de -999 n�o deve ser exibido.*/

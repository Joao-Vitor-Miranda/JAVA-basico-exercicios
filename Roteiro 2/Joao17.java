import java.util.Scanner;
public class Joao17{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   double a,b,c;
   System.out.println("Digite tr�s medidas:");
   a=ler.nextDouble();
   b=ler.nextDouble();
   c=ler.nextDouble();
      if(b-c<a && a<b+c && a-c<b && b<a+c && a-b<c && c<a+b){
         if(a==b && b==c)
         System.out.println("equil�tero");
         
         else if(a!=b && b!=c && c!=a)
         System.out.println("escaleno");
         
         else
         System.out.println("is�sceles");
      }
      else
      System.out.println("Essas medida n�o forma um tri�ngulo");
   }
}
/*Fa�a um programa que receba de entrada tr�s valores. Verificar se esses valores podem formar um
tri�ngulo. Caso n�o, informar que n�o forma um tri�ngulo; caso sim, imprima que tipo de tri�ngulo pode
ser formado (escaleno, is�sceles ou equil�tero).| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b*/
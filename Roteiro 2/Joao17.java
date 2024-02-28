import java.util.Scanner;
public class Joao17{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   double a,b,c;
   System.out.println("Digite três medidas:");
   a=ler.nextDouble();
   b=ler.nextDouble();
   c=ler.nextDouble();
      if(b-c<a && a<b+c && a-c<b && b<a+c && a-b<c && c<a+b){
         if(a==b && b==c)
         System.out.println("equilátero");
         
         else if(a!=b && b!=c && c!=a)
         System.out.println("escaleno");
         
         else
         System.out.println("isósceles");
      }
      else
      System.out.println("Essas medida não forma um triângulo");
   }
}
/*Faça um programa que receba de entrada três valores. Verificar se esses valores podem formar um
triângulo. Caso não, informar que não forma um triângulo; caso sim, imprima que tipo de triângulo pode
ser formado (escaleno, isósceles ou equilátero).| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b*/
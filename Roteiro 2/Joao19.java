import java.util.Scanner;
public class Joao19{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int num,d4,d3,d2,d1,d,b1,b2,b3,b4;
   float R;
   System.out.println("Digite um numero:(maximo 4 digitos)");
   num=ler.nextInt();
   
   d4=num%10;
   num=num-d4;
   num=num/10;
   
   d3=num%10;
   num=num-d3;
   num=num/10;
   
   d2=num%10;
   num=num-d2;
   num=num/10;
   
   d1=num%10;
   num=num-d1;
   num=num/10;
   

      if(d1==0 || d1==1){
         if(d2==0 || d2==1){
            if(d3==0 || d3==1){         
               if(d4==0 || d4==1){
               System.out.println("é um numero binário");
               b1=d1*8;
               b2=d2*4;
               b3=d3*2;
               b4=d4*1;
               R=b1+b2+b3+b4;
               System.out.printf("O numero em decimal é:%.2f",R);
            
               }
               else 
               System.out.println("Não é um numero binário");
            }
            else 
            System.out.println("Não é um numero binário");
            }
            
         else 
         System.out.println("Não é um numero binário");
              }
      else 
      System.out.println("Não é um numero binário");
   }
}
/*Implemente um algoritmo que receba de entrada um valor inteiro com 4 dígitos e verifique se o mesmo
pertence à família dos binários. Para isto, “desmembre” o número digitado verifique se foram digitados
somente bits. Caso o número digitado seja binário, seu algoritmo deve o converter para decimal e mostrar o
rsultado.*/
import java.util.Scanner;
public class Joao17{
   public static void main (String []args){
   int a,b,res=1;
    Scanner ler = new Scanner (System.in);
      System.out.println("Digite dois valores para calcular o mdc:");
      a=ler.nextInt();
      b=ler.nextInt();  
      if(a>b){    
      while(res!=0){
         res = a%b;
         a = b;
         b = res;      
    }
    System.out.print("m�ximo divisor comum �:"+a);
    }
    
    else{    
      while(res!=0){
         res = b%a;
         b = a;
         a = res;      
    }
    System.out.print("m�ximo divisor comum �:"+b);
    }
    
  }    
} 
/*Escreva um algoritmo que calcule o m.d.c. (m�ximo divisor comum) entre A e B (n�mero inteiros e
positivos). Esses dois valores s�o passados pelo usu�rio atrav�s do teclado. Utilize a l�gica do algoritmo
de Euclides.*/
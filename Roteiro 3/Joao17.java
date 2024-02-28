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
    System.out.print("máximo divisor comum é:"+a);
    }
    
    else{    
      while(res!=0){
         res = b%a;
         b = a;
         a = res;      
    }
    System.out.print("máximo divisor comum é:"+b);
    }
    
  }    
} 
/*Escreva um algoritmo que calcule o m.d.c. (máximo divisor comum) entre A e B (número inteiros e
positivos). Esses dois valores são passados pelo usuário através do teclado. Utilize a lógica do algoritmo
de Euclides.*/
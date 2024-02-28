import java.util.Scanner;
public class Joao14{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   double s,q,n,d;
   System.out.println("Digite o diâmetro:");
   d=ler.nextDouble();
   System.out.println("Digite a carga:");
   q=ler.nextDouble();
   
      if (d>100){
      n=2;
      }
    
      else if (d<50) {
      n=6;
      }
      else {
      n=4;
      }
      
    s=(4*q)/(3.1415*(Math.pow(d,2)))*n;
    
    System.out.printf("Tensão:%.2f",s);
   }
}
/*Elabore um programa que calcule e exiba a tensão S de uma barra cilíndrica de diâmetro D submetida a
uma carga Q. Os valores de D e Q devem ser fornecidos pelo usuário do programa via teclado. Utilize a
fórmula:onde, n = 2 para D > 100; n = 6 para D < 50 e; n = 4 para outros valores de D.*/
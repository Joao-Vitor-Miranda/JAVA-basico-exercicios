import java.util.Scanner;
public class Joao8 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float B,b,h,Area, val,valM;
   
   System.out.println("Digite o valor da base maior");
   B=ler.nextFloat();
   System.out.println("Digite o valor da base menor:");
   b=ler.nextFloat();
   System.out.println("Digite o valor da altura:");  
   h=ler.nextFloat();
   System.out.println("Digite o valor por metro quadrado:");
   val=ler.nextFloat();
  
   Area=(B+b)*h/2;
   valM = Area*val; 
   System.out.printf("Area:%.2f\nvalor medio �:%.2f",Area,valM);
   }
}
/*
Assim sendo, dados os valores das medidas da base maior, base menor e da altura do terreno (em metros), e
sabendo o valor m�dio (R$) pago por metro quadrado no local onde se encontra o lote, calcule e mostre a �rea
total e o valor m�dio de venda (R$) que Z� Borba Gato pode pedir pelo terreno.
*/
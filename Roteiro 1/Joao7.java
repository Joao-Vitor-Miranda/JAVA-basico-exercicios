import java.util.Scanner;
public class Joao7 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float l1,l2,l3,l4,Pe,Area ;
   
   System.out.println("Digite os valores dos lados");
   l1=ler.nextFloat();
   l2=ler.nextFloat();
   l3=ler.nextFloat();
   l4=ler.nextFloat();
      
   Pe=l1+l2+l3+l4;
   Area=l1*l2;   
   System.out.printf("Area:%.2f\nPer�metro:%.2f",Area,Pe);
   }
}
/*
Fa�a um algoritmo que calcule a �rea e o per�metro de um ret�ngulo recebendo de entrada os valores dos
lados.
*/

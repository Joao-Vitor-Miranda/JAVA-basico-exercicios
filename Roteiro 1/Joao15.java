import java.util.Scanner;
public class Joao15 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   double r,area;
   
   System.out.println("Digite o raio da circunfer�ncia");
   r=ler.nextDouble();
   area=3.1416*(Math.pow(r,2));
 
   System.out.printf("A �rea de uma circunfer�ncia �:%.2f",area);
   }
}
/*
Fa�a um algoritmo que calcule a �rea de uma circunfer�ncia, recebendo o valor do raio. Obs.: Defina PI
como constante de valor 3.1416.
*/
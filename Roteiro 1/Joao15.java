import java.util.Scanner;
public class Joao15 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   double r,area;
   
   System.out.println("Digite o raio da circunferência");
   r=ler.nextDouble();
   area=3.1416*(Math.pow(r,2));
 
   System.out.printf("A área de uma circunferência é:%.2f",area);
   }
}
/*
Faça um algoritmo que calcule a área de uma circunferência, recebendo o valor do raio. Obs.: Defina PI
como constante de valor 3.1416.
*/
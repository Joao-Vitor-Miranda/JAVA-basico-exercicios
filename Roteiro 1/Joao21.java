import java.util.Scanner;
public class Joao21{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   
   double a,h,sen,R;
   System.out.println("�ngulo formado pela escada:");
   a=ler.nextDouble();
   System.out.println("altura da parede:");
   h=ler.nextDouble();
   
   sen=Math.sin(a);
   R=h/sen;
   
   System.out.print("A medida da escada para que a ponta da parede possa ser alcan�ada:"+R+"||"+sen);
   } 
}
/*Fa�a um programa que receba a medida do �ngulo formado por uma escada apoiada e a altura da parede.
Calcule e mostre a medida da escada para que a ponta da parede possa ser alcan�ada.*/
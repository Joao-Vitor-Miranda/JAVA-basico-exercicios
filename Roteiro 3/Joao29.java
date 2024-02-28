import java.util.Scanner;
public class Joao29{
   public static void main (String []args){
   int Q=0,d1,d2,x,resto=0;
      Scanner ler = new Scanner (System.in);
      System.out.println("dividendo:");
      d1=ler.nextInt();
      System.out.println("divisor");
      d2=ler.nextInt();
      x=d1;
      while (x>=d2){
      x=x-d2;
      resto=x;
      Q++;
      } 
      System.out.println("Quociente:"+Q);
      System.out.println("Resto:"+resto);
   }
}
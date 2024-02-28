import java.util.Scanner;
public class Joao11{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   double x;
   
   System.out.println("Digite o o valor do X:");
   x=ler.nextDouble();
   
      if (x<=1){
      x=1;
      }
      else if (x>1 && x<=2) {
      x=2;
      }
      else if (x>2 && x<=3){
      x=Math.pow(x,2);
      }   
      else  {
      x=Math.pow(x,3);
      }
      
    
    System.out.print("o valor de f(x) é:" +x);
   }
}
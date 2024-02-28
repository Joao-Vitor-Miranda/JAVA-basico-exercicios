import java.util.Scanner;
public class Joao26{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   double  s=0,x=0,den=1,num=1,exp=1;
   int i,j;
   
      System.out.print("Digite o grau que deseja saber do seno: ");
      x=ler.nextDouble();
      
      for(i=1;i<=15;i++){
      num=Math.pow(x,exp);
      double fat=1;
      
         for(j=1;j<=den;j++){
         fat*=j;
         }
         
         if(i%2==0)
         s=s-(num/fat);
         
         else
         s=s+(num/fat);
         
         exp+=2;
         den+=2;
         } 
         System.out.print("seno: "+s);
   }
}
import java.util.Scanner;
public class Joao26{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   double sal,temp,imp,impR,g=0,gR,Res;
   
   System.out.print("Digite o sal�rio R$");
   sal=ler.nextDouble();
   System.out.println("Digite o tempo de servi�o:(ANOS)");
   temp=ler.nextDouble();
   
   
      if(sal<200)
      imp=0;
      
      else if(sal>=200 && sal<=450)
      imp=0.03;
      
      else if(sal>450 && sal<700)
      imp=0.08;
      
      else
      imp=0.12;
      
      impR=sal*imp;
      
      if(temp<=3){
         if(sal>500)
         g=0.2;
         else
         g=0.23;
      }
      
      else if(temp>3){
         if(sal>500)
         g=0.3;
      }
      
      else if(temp>3 && temp<6){
         if(sal<=500)
         g=0.35; 
      }     
      else {
         g=0.33;
      }
      
      gR=sal*g;
      Res=(sal+gR)-impR;
      
      if(sal<=350)
      System.out.println("Classifica��o: A");
      
      else if(sal>350 && sal<=600)
      System.out.println("Classifica��o: B");
      
      else 
      System.out.println("Classifica��o: C");
      
      System.out.printf("imposto:R$%.2f | gratifica��o:R$%.2f\nsal�rio l�quido:R$%.2f",impR,gR,Res);
   }
}
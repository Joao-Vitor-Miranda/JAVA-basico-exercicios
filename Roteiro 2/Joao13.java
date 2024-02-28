import java.util.Scanner;
public class Joao13{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   double peso,h,imc;
   
   System.out.println("Digite o peso:");
   peso=ler.nextDouble();
   System.out.println("Digite a altura:");
   h=ler.nextDouble();
  
   imc=peso/(Math.pow(h,2));    
     
     if(imc<18.5){
     System.out.print("abaixo do peso");
     }
     else if(imc>=18.5 && imc<=25){
     System.out.print("peso normal");
     }
     else if(imc>=25 && imc<=30){
     System.out.print("acima do peso");
     }
     else{
     System.out.print("obeso");
     }
     
   }
}
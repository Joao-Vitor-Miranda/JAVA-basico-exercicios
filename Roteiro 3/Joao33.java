import java.util.Scanner;
public class Joao33{
   public static void main (String []args){
   Scanner ler = new Scanner(System.in);
   long cpf,d1,d2,dig=0,i=2,sm1=0,sm2=0,resto,dv1,dv2;
   
   System.out.println("Digite o cpf: ");
   cpf=ler.nextLong();
   
   d2=cpf%10;
   cpf=cpf/10;
   d1=cpf%10;
   cpf=cpf/10;
      while(cpf>0){
      dig=cpf%10;
      cpf=cpf/10;
      sm1+=dig*1;
      sm2+=dig*(i+1);
      i++;
      }
      resto=sm1%11;
         if(resto<2){
         dv1=0;
         }
         else{
         dv1=11-resto;
         }
         sm2=sm2+dv1*2;
         resto=sm2%11;
         
         if(resto<2){
         dv2=0;
         }
         else{
         dv2=11-resto;
         }
         if(dv1==d1 && dv2==d2){
         System.out.println("cpf e valido");
         }
         else{
         System.out.println("cpf invalido");
         }
 }
}
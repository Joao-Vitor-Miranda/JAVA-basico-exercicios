import java.util.Scanner;
public class Joao23{
   public static void main (String []args){
   Scanner ler = new Scanner(System.in);
   long cpf,d11,d10,d9,d8,d7,d6,d5,d4,d3,d2,d1,Sm,Dv,Sm1,Dv1;
   System.out.println("Digite o cpf:");
   cpf=ler.nextLong();

   d11=cpf%10;
   cpf=cpf-d11;
   cpf=cpf/10;
   
   d10=cpf%10;
   cpf=cpf-d10;
   cpf=cpf/10;
   
   d9=cpf%10;
   cpf=cpf-d9;
   cpf=cpf/10;
  
   d8=cpf%10;
   cpf=cpf-d9;
   cpf=cpf/10;
   
   d7=cpf%10;
   cpf=cpf-d7;
   cpf=cpf/10;
   
   d6=cpf%10;
   cpf=cpf-d6;
   cpf=cpf/10;
   
   d5=cpf%10;
   cpf=cpf-d5;
   cpf=cpf/10;
   
   d4=cpf%10;
   cpf=cpf-d4;
   cpf=cpf/10;
   
   d3=cpf%10;
   cpf=cpf-d3;
   cpf=cpf/10;
   
   d2=cpf%10;
   cpf=cpf-d2;
   cpf=cpf/10;
   
   d1=cpf%10;
   cpf=cpf-d1;
   cpf=cpf/10;
   
   d1=d1*10;
   d2=d2*9;
   d3=d3*8;
   d4=d4*7;
   d5=d5*6;
   d6=d6*5;
   d7=d7*4;
   d8=d8*3;
   d9=d9*2;
  
   Sm=d1+d2+d3+d4+d5+d6+d7+d8+d9;
   Dv=Sm%11;
  
      
      if(d10==11-Dv || Dv<2 && d10==0){
      d1=d1/10;
      d2=d2/9;
      d3=d3/8;
      d4=d4/7;
      d5=d5/6;
      d6=d6/5;
      d7=d7/4;
      d8=d8/3;
      d9=d9/2;
      
      d1=d1*11;
      d2=d2*10;
      d3=d3*9;
      d4=d4*8;
      d5=d5*7;
      d6=d6*6;
      d7=d7*5;
      d8=d8*4;
      d9=d9*3;
      d10=d10*2;
      
      Sm1=d1+d2+d3+d4+d5+d6+d7+d8+d9+d10;
      Dv1=Sm1%11;
      
      
      
         if(d11==11-Dv1 || Dv1<2 && d11==0){
          System.out.println("Cpf valido");
         }
         else{
         System.out.println("Cpf inv�lido");
         }
      }
      else{
      System.out.println("Cpf inv�lido");
      }   
   }
}




/*23. O n�mero de inscri��o no CPF � composto de onze d�gitos decimais, sendo os oito primeiros
aleatoriamente designados no momento da inscri��o. J� o nono (antepen�ltimo) d�gito indica a regi�o fiscal
respons�vel pela inscri��o (MG � a regi�o 6, portanto em todos CPF�s emitidos em MG o nono digito � 6).
Por fim, o d�cimo e o d�cimo primeiro s�o d�gitos verificadores calculados de acordo com um
algoritmo definido pela Receita Federal e publicamente conhecido. Refer�ncias abaixo:*/
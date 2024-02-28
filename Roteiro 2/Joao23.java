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
         System.out.println("Cpf inválido");
         }
      }
      else{
      System.out.println("Cpf inválido");
      }   
   }
}




/*23. O número de inscrição no CPF é composto de onze dígitos decimais, sendo os oito primeiros
aleatoriamente designados no momento da inscrição. Já o nono (antepenúltimo) dígito indica a região fiscal
responsável pela inscrição (MG é a região 6, portanto em todos CPF’s emitidos em MG o nono digito é 6).
Por fim, o décimo e o décimo primeiro são dígitos verificadores calculados de acordo com um
algoritmo definido pela Receita Federal e publicamente conhecido. Referências abaixo:*/
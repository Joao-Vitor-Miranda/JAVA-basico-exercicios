import java.util.Scanner;
public class Joao18{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   int num,n1,n2,n3;
   System.out.print("Digite um n�mero de 3 d�gito:");
   num=ler.nextInt();
   
   n1=num%10;
   num=num-n1;
   num=num/10;
  
   n2=num%10;
   num=num-n2;
   num=num/10;
   
   n3=num%10;
   num=num-n3;
   num=num/10;
   
   
   if(num!=0)
   System.out.println("Por favor digite um numero com no maximo 3 dig�to");
   
   else{
         if(n1==n3)
         System.out.println("� pal�ndromo");
         
         else if(n3+1==1)
         System.out.println("Por favor digite um numero com no minimo 3 dig�to");  
            
         else
         System.out.println("N�O � pal�ndromo");            
       }
           
   }
}


/*Implemente um programa que receba um n�mero inteiro de 3 d�gitos de entrada. Ap�s isso, verifique se o
mesmo � pal�ndromo, ou seja, � o mesmo n�mero lido da direita para esquerda ou vice-versa. Ex.: 121,
353, etc. N�o � permitido a utiliza��o de fun��es prontas do JAVA, tal como o m�todo reverse.*/
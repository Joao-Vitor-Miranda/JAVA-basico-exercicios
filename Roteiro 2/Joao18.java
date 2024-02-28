import java.util.Scanner;
public class Joao18{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   int num,n1,n2,n3;
   System.out.print("Digite um número de 3 dígito:");
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
   System.out.println("Por favor digite um numero com no maximo 3 digíto");
   
   else{
         if(n1==n3)
         System.out.println("É palíndromo");
         
         else if(n3+1==1)
         System.out.println("Por favor digite um numero com no minimo 3 digíto");  
            
         else
         System.out.println("NÃO é palíndromo");            
       }
           
   }
}


/*Implemente um programa que receba um número inteiro de 3 dígitos de entrada. Após isso, verifique se o
mesmo é palíndromo, ou seja, é o mesmo número lido da direita para esquerda ou vice-versa. Ex.: 121,
353, etc. Não é permitido a utilização de funções prontas do JAVA, tal como o método reverse.*/
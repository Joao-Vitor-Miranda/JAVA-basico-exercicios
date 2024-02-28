import java.util.Scanner;
public class Joao6{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   double x,y,R;
   int op;
   
   System.out.println("Entre com dois numeors para realizar uma operação:");
   x=ler.nextDouble();
   y=ler.nextDouble();
   System.out.println("Escolhe a operação:('1' soma; ' 2 ' subtração; ' 3 ' multiplicação e ' 4 'divisão)");
   op=ler.nextInt();
   
      switch (op){
         case 1:
         R=x+y;
         System.out.println(R);
         break;
         case 2:
         R=x-y;
         System.out.println(R);
         break;   
         case 3:
         R=x*y;
         System.out.println(R);
         break;
         case 4:
         R=x/y;
         System.out.println(R);
         break;
         default:System.out.println("Erro");
      }
   
   }
}
/*Faça um programa que simule uma calculadora simples. Para isso, o usuário deverá entrar com dois
números quaisquer e a operação que deseja realizar: '+' soma; ' - ' subtração; ' * ' multiplicação e ' / '
divisão. Lembre-se das condições para realizar a divisão. Utilize a estrutura switch/case e apresente um
menu de opções para o usuário.*/
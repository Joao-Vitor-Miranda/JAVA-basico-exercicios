import java.util.Scanner;
public class Joao6{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   double x,y,R;
   int op;
   
   System.out.println("Entre com dois numeors para realizar uma opera��o:");
   x=ler.nextDouble();
   y=ler.nextDouble();
   System.out.println("Escolhe a opera��o:('1' soma; ' 2 ' subtra��o; ' 3 ' multiplica��o e ' 4 'divis�o)");
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
/*Fa�a um programa que simule uma calculadora simples. Para isso, o usu�rio dever� entrar com dois
n�meros quaisquer e a opera��o que deseja realizar: '+' soma; ' - ' subtra��o; ' * ' multiplica��o e ' / '
divis�o. Lembre-se das condi��es para realizar a divis�o. Utilize a estrutura switch/case e apresente um
menu de op��es para o usu�rio.*/
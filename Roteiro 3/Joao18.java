import java.util.Scanner;
public class Joao18{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   int op;
   double a,b,R;
      do{  
      System.out.println("===========\nCalculadora\n===========\nOp��es:\n1 - Soma\n2 - Subtra��o\n3 - Multiplica��o\n4 - Divis�o\n5 - Sair");
      op=ler.nextInt();
         if(op!=5){
         System.out.println("Digite dois numeros para fazer a opera��o:");
         a=ler.nextDouble();
         b=ler.nextDouble();
            switch (op){
            case 1:
               R=a+b;
               System.out.println("Resultado:"+R);
            break;
            case 2:
               R=a-b;
               System.out.println("Resultado:"+R);
            break;
            case 3:
               R=a*b;
               System.out.println("Resultado:"+R);
            break;
            case 4:
               if(b!=0){
               R=a/b;
               System.out.println("Resultado:"+R);
               }
               else
               System.out.println("ERRO");
            break;
            default: System.out.println("Escolha apenas numeros de 1 a 5");
     
            }
         }
      }
      while(op!=5);
      System.out.println("FIM");
   }
}
/*Fa�a um algoritmo que simule o funcionamento de uma calculadora que contenha as opera��es
aritm�ticas b�sicas com dois n�meros digitados pelo usu�rio. O programa implementado deve mostrar
seguinte menu ao usu�rio. N�o se esque�a de verificar se as opera��es podem ser realizadas.
Calculadora de Fulano
====================
Op��es:
1 - Soma
2 - Subtra��o
3 - Multiplica��o
4 - Divis�o
5 � Sair
*/
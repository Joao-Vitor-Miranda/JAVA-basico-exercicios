import java.util.Scanner;
public class Joao18{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   int op;
   double a,b,R;
      do{  
      System.out.println("===========\nCalculadora\n===========\nOpções:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair");
      op=ler.nextInt();
         if(op!=5){
         System.out.println("Digite dois numeros para fazer a operação:");
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
/*Faça um algoritmo que simule o funcionamento de uma calculadora que contenha as operações
aritméticas básicas com dois números digitados pelo usuário. O programa implementado deve mostrar
seguinte menu ao usuário. Não se esqueça de verificar se as operações podem ser realizadas.
Calculadora de Fulano
====================
Opções:
1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão
5 – Sair
*/
import java.util.Scanner;
public class Joao6 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   double salario,comissao,venda,R;
   
   System.out.println("Sal�rio:");
   salario=ler.nextDouble();
   System.out.println("Valor de vendas realizadas:");
   venda=ler.nextDouble();
   
   comissao=venda*0.04;
   R=salario+comissao;
   
   System.out.printf("A receber:%.2f benef�cio:%.2f",R,comissao);
   }
}
   
/*
Funcion�rios da IFVende tem como benef�cio a receber ao final de cada m�s um sal�rio fixo mais 4% de
comiss�o sobre as vendas realizadas pelo mesmo. Assim, fa�a um algoritmo que receba o sal�rio fixo e o
valor de vendas realizadas por um funcion�rio, calcule e mostre o benef�cio a ser recebido pelo mesmo.
*/
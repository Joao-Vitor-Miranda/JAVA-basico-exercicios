import java.util.Scanner;
public class Joao5{
public static void main(String [] args){
      Scanner ler = new Scanner (System.in);
      double salario, gratificacao=1.1, imposto=0.05, R1, R2, R3;
      
      System.out.println("Digite o sal�rio");
      salario=ler.nextDouble();
      
      R1=(salario*gratificacao);
      R2=R1*imposto;
      R3=R1-R2;

      System.out.printf("O salario �:%.2f",R3);
      
   }
}
/*
Fa�a um programa que receba o sal�rio base de um funcion�rio, calcule e mostre o sal�rio a receber,
sabendo que esse funcion�rio possui uma gratifica��o de 10% sobre o sal�rio base e paga 5% de imposto
sobre o valor acumulado (sal�rio base + gratifica��o).
*/
import java.util.Scanner;
public class Joao5{
public static void main(String [] args){
      Scanner ler = new Scanner (System.in);
      double salario, gratificacao=1.1, imposto=0.05, R1, R2, R3;
      
      System.out.println("Digite o salário");
      salario=ler.nextDouble();
      
      R1=(salario*gratificacao);
      R2=R1*imposto;
      R3=R1-R2;

      System.out.printf("O salario é:%.2f",R3);
      
   }
}
/*
Faça um programa que receba o salário base de um funcionário, calcule e mostre o salário a receber,
sabendo que esse funcionário possui uma gratificação de 10% sobre o salário base e paga 5% de imposto
sobre o valor acumulado (salário base + gratificação).
*/
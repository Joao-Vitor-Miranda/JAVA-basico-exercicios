import java.util.Scanner;
public class Joao8{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   double salario,salarioNovo;
   System.out.println("Digite o salário ATUAL:");
   salario=ler.nextDouble();
   
      if (salario<=700){
      salarioNovo=salario*1.3;
      }
    
      else {
      salarioNovo=salario*1.1;
      }
      
    
    System.out.printf("Salário novo:%.2f",salarioNovo);
   }
}
/*
Uma empresa decide dar um aumento de 30% aos funcionários com salário inferior à R$700,00 e 10% aos
funcionários com salário superior ou igual à R$700,00. Faça um algoritmo que calcule o reajuste e mostre
o novo salário.*/
import java.util.Scanner;
public class Joao8{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   double salario,salarioNovo;
   System.out.println("Digite o sal�rio ATUAL:");
   salario=ler.nextDouble();
   
      if (salario<=700){
      salarioNovo=salario*1.3;
      }
    
      else {
      salarioNovo=salario*1.1;
      }
      
    
    System.out.printf("Sal�rio novo:%.2f",salarioNovo);
   }
}
/*
Uma empresa decide dar um aumento de 30% aos funcion�rios com sal�rio inferior � R$700,00 e 10% aos
funcion�rios com sal�rio superior ou igual � R$700,00. Fa�a um algoritmo que calcule o reajuste e mostre
o novo sal�rio.*/
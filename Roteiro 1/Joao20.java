import java.util.Scanner;
public class Joao20{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   
   double salM,horasT,horasE,a,b,c;
   
   System.out.println("Entre com Salario minimo:");
   salM=ler.nextDouble();
   
   System.out.println("Entre com Horas trabalhadas:");
   horasT=ler.nextDouble();
   
   System.out.println("Entre com Horas extras:");
   horasE=ler.nextDouble();
   
   a=(0.125*salM)*horasT;
   b=(0.25*salM)*horasE;
   c=a+b;
   System.out.printf("o salário a recebe é:%.2f",c);
   
   } 
}
/*
Faça um algoritmo que receba o número de horas trabalhadas, o valor do salário mínimo e o número de
horas extras trabalhadas. Calcule e mostre o salário a receber seguindo as seguintes regras:
a) O valor a ser pago por hora trabalhada é 0.125 do salário mínimo;
b) O valor a ser pago por hora extra vale 0.25 do salário mínimo;
c) o salário bruto equivale ao número de horas trabalhadas vezes o valor pago por hora;
d) a quantia a receber por horas extras equivale à horas extras realizadas multiplicado pelo valor pago
por hora extra;
e) o salário a receber equivale à soma do salário bruto mais a quantia a receber pelas horas extras.*/
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
   System.out.printf("o sal�rio a recebe �:%.2f",c);
   
   } 
}
/*
Fa�a um algoritmo que receba o n�mero de horas trabalhadas, o valor do sal�rio m�nimo e o n�mero de
horas extras trabalhadas. Calcule e mostre o sal�rio a receber seguindo as seguintes regras:
a) O valor a ser pago por hora trabalhada � 0.125 do sal�rio m�nimo;
b) O valor a ser pago por hora extra vale 0.25 do sal�rio m�nimo;
c) o sal�rio bruto equivale ao n�mero de horas trabalhadas vezes o valor pago por hora;
d) a quantia a receber por horas extras equivale � horas extras realizadas multiplicado pelo valor pago
por hora extra;
e) o sal�rio a receber equivale � soma do sal�rio bruto mais a quantia a receber pelas horas extras.*/
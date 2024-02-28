import java.util.Scanner;
public class Joao6 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   double salario,comissao,venda,R;
   
   System.out.println("Salário:");
   salario=ler.nextDouble();
   System.out.println("Valor de vendas realizadas:");
   venda=ler.nextDouble();
   
   comissao=venda*0.04;
   R=salario+comissao;
   
   System.out.printf("A receber:%.2f benefício:%.2f",R,comissao);
   }
}
   
/*
Funcionários da IFVende tem como benefício a receber ao final de cada mês um salário fixo mais 4% de
comissão sobre as vendas realizadas pelo mesmo. Assim, faça um algoritmo que receba o salário fixo e o
valor de vendas realizadas por um funcionário, calcule e mostre o benefício a ser recebido pelo mesmo.
*/
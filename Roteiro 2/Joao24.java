import java.util.Scanner;
public class Joao24{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int produto,quantidade;
   double val=0,totalNota,des,R;
   
   System.out.print("Digite o código do produto:");
   produto=ler.nextInt();
   System.out.print("Digite a quantidade que deseja comprar:");
   quantidade=ler.nextInt();
   
   
      if(produto>=1 && produto<=10){
      val=10;
      }
      else if(produto>=11 && produto<=20){
      val=20;
      }
      else if(produto>=21 && produto<=30){
      val=30;
      }
      else if(produto>=31 && produto<=40){
      val=40;
      }
      else{
      System.out.println("Produto sem cadastro");
      }
      
      totalNota=quantidade*val;
      
      if(totalNota<=250){
      des=totalNota*0.05;
      }
      else if(totalNota>250 && totalNota<=500){
      des=totalNota*0.1;
      }
      else {
      des=totalNota*0.15;
      }
      
      R=totalNota-des;
      
   System.out.printf("O preço unitário do produto:R$%.2f\nPreço total da nota:R$%.2f\nO valor do desconto:R$%.2f\nPreço final após desconto:R$%.2f",val,totalNota,des,R);   
   }
}

/*Faça um programa que recebe de entrada o código de um produto e a quantidade comprada do mesmo.
Calcule e mostre:
a) O preço unitário do produto, segundo Tabela I
b) Preço total da nota
c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
d) Preço final ao consumidor após desconto
e) Não se esqueça de verificar a existência do produto*/
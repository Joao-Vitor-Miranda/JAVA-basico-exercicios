import java.util.Scanner;
public class Joao24{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int produto,quantidade;
   double val=0,totalNota,des,R;
   
   System.out.print("Digite o c�digo do produto:");
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
      
   System.out.printf("O pre�o unit�rio do produto:R$%.2f\nPre�o total da nota:R$%.2f\nO valor do desconto:R$%.2f\nPre�o final ap�s desconto:R$%.2f",val,totalNota,des,R);   
   }
}

/*Fa�a um programa que recebe de entrada o c�digo de um produto e a quantidade comprada do mesmo.
Calcule e mostre:
a) O pre�o unit�rio do produto, segundo Tabela I
b) Pre�o total da nota
c) O valor do desconto, segundo Tabela II, aplicado sobre o valor total da nota
d) Pre�o final ao consumidor ap�s desconto
e) N�o se esque�a de verificar a exist�ncia do produto*/
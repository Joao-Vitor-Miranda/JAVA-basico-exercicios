import java.util.*;
public class JoaoMiranda12{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int vet[][] = new int [5][3],sm=0,k=0,M=0,Maior=0,m=0,menor=0,Ce=0,Em=0,E=0;
   int vetQ[]= new int [4];
      for(int i=0; i<4; i++){
         for(int j=0; j<3; j++){
         System.out.println("Produto: "+ (j+1) + " Armazén: "+ (i+1) );
         vet[i][j]=ler.nextInt();
         sm+=vet[i][j];
         if(j==2){
         vetQ[k]=sm;
         sm=0;
         k++;
         }}
      }
      for(int i=0;i<3;i++){
         System.out.println(" o custo de estocagem de uma unidade do produto "+(i+1)+" : ");
         vet[4][i]=ler.nextInt();
         }
     for(int i=0; i<4; i++){
         for(int j=0; j<3; j++){ 
         if(j==2){
            if(i==0 || Maior<vet[i][j]){
            Maior=vet[i][j];
            M=i;
         }}
         }}
     for(int i=0; i<4; i++){
         for(int j=0; j<3; j++){ 
            if(i==0 || menor>vet[i][j]){
            menor=vet[i][j];
            m=i;
         }}
         }
      for(int i=0; i<4; i++){ 
         for(int j=0; j<3; j++){
          Ce+=vet[4][j]*vet[i][j];}
            if(i==0 || Ce<Em){
            Em=Ce;
            E=i;}
          }
      
     
     
      for(int i=0; i<vetQ.length; i++){
         System.out.println("Quantidade no amarzen "+(i+1)+":"+vetQ[i]);
         }
      System.out.println("O armazém "+ (M+1) +" possui maior estoque do produto 2");
      System.out.println("O armazém "+ (m+1) +" possui menor estoque");
      System.out.println("O armazém "+(E+1)+" possui maior custo de estocagem");
   }
 }
 /*Faça um programa que receba o estoque atual de 3 produtos que estão armazenados em 4 armazéns e
coloque esses dados em uma matriz 5 x 3. Sendo que a última linha da matriz contém o custo de
estocagem de uma unidade de cada produto, calcule e mostre:
a) Quantidade de itens armazenados em cada armazém;
b) Qual armazém possui maior estoque do produto 2;
c) Qual armazém possui menor estoque;
d) Qual armazém possui maior custo de estocagem.*/

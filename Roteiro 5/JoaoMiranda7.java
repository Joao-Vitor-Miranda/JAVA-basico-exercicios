
import java.util.*;
public class JoaoMiranda7{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   float vet[][]=new float[4][7],menor=0,maior=0;
   int k=0;
   for(int i=0;i<vet.length;i++){
      for(int j=0;j<vet[i].length;j++){
      System.out.println("Digite um numero para linha "+(i+1)+" coluna "+(j+1));
      vet[i][j]=ler.nextFloat();
      }
      }
   for(int i=0;i<vet.length;i++){
      for(int j=0;j<vet[i].length;j++){
         if(i==0 || vet[i][j]<menor){
         menor=vet[i][j];
         k=i;}
      }
      }
   for(int i=0;i<vet[k].length;i++){
         if(i==0 || vet[k][i]>maior){
         maior=vet[k][i];
         }}
   System.out.println(maior);
   
   }
}/*Na teoria de sistemas define-se o elemento MINMAX de uma matriz como sendo o maior elemento da
linha onde se encontra o menor elemento da matriz. Faça um programa que carregue uma matriz 4 x 7
com números reias, calcule e mostre o MINMAX e sua posição (linha e coluna).*/
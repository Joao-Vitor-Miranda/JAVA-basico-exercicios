import java.util.*;
public class JoaoMiranda1{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int vet[][] = new int [2][2],maior=0;
      for(int i=0; i<vet.length; i++){
         for(int j=0; j<vet[i].length; j++){
         System.out.println("Digite um numero:");
         vet[i][j]=ler.nextInt();
         
            if((j==0 && i==0)|| vet[i][j]>maior){
            maior = vet[i][j];
            }
         }
      }
      for(int i=0; i<vet.length; i++){
         for(int j=0; j<vet[i].length; j++){
         vet[i][j]=vet[i][j]*maior;

         }
      }
      
      for(int i=0; i<vet.length; i++){
         for(int j=0; j<vet[i].length; j++){
         System.out.print(" "+vet[i][j]);
         }
         System.out.println("");
      }
   }
 }
 /*Faça um programa que preencha uma matriz 2 x 2, calcule e mostre uma matriz resultante que será a
matriz digitada multiplicada pelo maior elemento da mesma.*/
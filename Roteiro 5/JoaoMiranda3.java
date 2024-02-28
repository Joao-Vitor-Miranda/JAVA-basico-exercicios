 import java.util.*;
public class JoaoMiranda3{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
      int l,c;
      System.out.println("Digite o numero de linhas, em seguida o de colunas:");
      l=ler.nextInt();
      c=ler.nextInt();
      float vetA[][]= new float[3][4];
      float vetB[][]= new float[l][c];
      double vetR[][]= new double[3][c];
         if(4==l){
         for(int i=0;i<vetA.length;i++){
             for(int j=0;j<vetA[i].length;j++){
             System.out.println("Digite um número:(Matriz A): ");
             vetA[i][j]=ler.nextFloat();}}
             
         for(int i=0;i<vetB.length;i++){
             for(int j=0;j<vetB[i].length;j++){
             System.out.println("Digite um número:(Matriz B): ");
             vetB[i][j]=ler.nextFloat();}}
             
         for(int i=0;i<vetR.length;i++){
             for(int j=0;j<vetR[i].length;j++){
               for(int k=0; k < c ;k++){
                  vetR[i][j]=(vetA[i][k] * vetB[k][j])+vetR[i][j];
             }}}
             
          for(int i=0;i<vetR.length;i++){
             for(int j=0;j<vetR[i].length;j++){
             System.out.print(" "+vetR[i][j]);
             }
             System.out.println("");
             }
         
         
         }
         else
         System.out.println("Não é possível realize a operação");
   } 
}
 
 /*Faça um programa que preencha uma matriz A[3][4], e outra matriz B[linhas][colunas] em que as 
dimensões são digitadas pelo usuário. Após isso, verifique se a operação de multiplicação de matrizes (A 
x B) pode ser realizada, caso seja possível, realize a operação e imprima a matriz resultante.*/
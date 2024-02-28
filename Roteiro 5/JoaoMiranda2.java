import java.util.*;
public class JoaoMiranda2{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
      float vet[][]= new float[3][5];
      float vetR[]= new float[3],sm=0,maior=0;
      int linha=0,j;
      for(int i=0;i<vet.length;i++){
         for(j=0;j<vet[i].length;j++){
         System.out.print("Digite um numero:");
         vet[i][j]=ler.nextInt();
         sm+=vet[i][j];
         }
         if((i==0) ||  sm  > maior ){
         maior=sm;
         linha=i+1;
         }
         vetR[i]=sm;
         sm=0;
      }
        for(int i=0; i<vetR.length; i++){
        if(i==0)
         System.out.println("a linha "+linha+" tem o maior valor somado");
         
         System.out.print(" "+vetR[i]);
      } 
      
   } 
}
/*Faça um programa que preencha uma matriz 3 x 5 com números reais. Some os valores de cada linha e 
armazene em um vetor. A seguir, mostre qual a linha que tem maior valor somado.*/

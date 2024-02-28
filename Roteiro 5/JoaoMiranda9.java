import java.util.*;
public class JoaoMiranda9{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   float vet[][]=new float[8][8];
   int k=0;
   
   boolean simetrica = true;
   
   for(int i=0;i<vet.length;i++){
      for(int j=0;j<vet[i].length;j++){
      System.out.println("Digite um numero para linha "+(i+1)+" coluna "+(j+1));
      vet[i][j]=ler.nextFloat();
      }
      }
   for(int i=0;i<vet.length;i++){
      for(int j=0;j<vet[i].length;j++){
         if(vet[i][j] != vet[j][i]){
            simetrica=false;
            break;
         }
      }
      }
   
   if(simetrica==true)
   System.out.println("é simétrica");
   else
   System.out.println("não é simétrica");
   }
}
/*Faça um programa que carregue uma matriz 8 x 8 com números reias e mostre uma mensagem dizendo se
a matriz é ou não simétrica. Uma matriz é simétrica se para todas as posições da mesma, tem-se a relação
A[i][j] = A[j][i].*/

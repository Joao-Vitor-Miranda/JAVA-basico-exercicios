import java.util.Scanner;
public class JoaoMiranda3{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      System.out.print("Digite os N primeiros termos da serie de Fibonacci: ");
      int n=ler.nextInt();
      int fi[]=new int[n];
      for(int i=0;i<=n;i++){
         if(i==0 || i==1){
         fi[i]=1;
         }
         else{
         fi[i]=i+fi[i-1];
         }
      }
      for(int j=0;j<n;j++){
      System.out.print(fi[j]);
      }      
   }
}
/*Faça um programa em JAVA que carregue em um vetor os N primeiros valores da serie de Fibonacci.
Fibonacci = [1, 1, 2, 3, 5, 8, 13, 21, ....].*/
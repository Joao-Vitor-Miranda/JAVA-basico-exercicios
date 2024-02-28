import java.util.Scanner;
public class JoaoMiranda3{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int n;
      System.out.println("os N primeiros valores da serie de Fibonacci");
      n=ler.nextInt();
      int vetF[]=new int[n]; 
                 
      for(int i=0;i<n;i++){
         if(i==0){
         vetF[i]=1;
         }
         else if(i==1){
         vetF[i]=1;
         }
         else{
         vetF[i]=vetF[i-1]+vetF[i-2];
         } 
      } 
      for(int j=0;j<n;j++){
      System.out.println(vetF[j]);
      }    
   }
}
/*Faça um programa em JAVA que carregue em um vetor os N primeiros valores da serie de Fibonacci.
Fibonacci = [1, 1, 2, 3, 5, 8, 13, 21, ....].*/
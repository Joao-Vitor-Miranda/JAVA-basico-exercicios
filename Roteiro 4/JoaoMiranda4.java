import java.util.Scanner;
public class JoaoMiranda4{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      double vet[]=new double[10];            
      for(int i=0;i<10;i++){
      vet[i]=Math.pow(i,2);
      } 
      for(int j=0;j<10;j++){
      System.out.println(vet[j]);
      }    
   }
}

/*Faça um programa em JAVA que gere um vetor com 10 posições onde cada elemento coresponde ao
quadrado de sua posição. Imprima o vetor resultante.*/
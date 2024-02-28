import java.util.Scanner;
public class JoaoMiranda2{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int vetorOriginal[]=new int[10];
      int vetInvertirdo[] = new int[10];
            
      for(int i=0;i<10;i++){
      System.out.println("Digite 10 numero:");
      vetorOriginal[i]=ler.nextInt();
      }
      for(int j=9, i=0;j>=0;j--, i++){
      vetInvertirdo[j] = vetorOriginal[i];
      }
      for(int h=0;h<10;h++){
      System.out.print("\nVetorOriginal: "+vetorOriginal[h]);
      }
      for(int l=0;l<10;l++){
      System.out.print("\nVetorInvertido: "+vetInvertirdo[l]);
      }
      
   }
}

/*Faça um programa que solicite o preenchimento de um vetor com 10 posições chamado
VetorOriginal. Em seguida, o programa deve armazenar os números digitados de maneira invertida
em vetor chamado VetorInvertido.VetorOriginal
10 15 9 14 2 3 6 8 20 11
VetorInvertido
11 20 8 6 3 2 14 9 15 10*/
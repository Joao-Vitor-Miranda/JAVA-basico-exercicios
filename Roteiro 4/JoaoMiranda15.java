import java.util.Scanner;
public class JoaoMiranda15{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int vet[]= new int[5],sm=0,pr=1;
      for(int i=0; i<vet.length; i++){
         System.out.print("Digite um valor para o vetor:");
         vet[i]=ler.nextInt();
         sm+=vet[i];
         pr*=vet[i];
         }
         System.out.print("soma: "+sm+" produto: "+pr);

   }
}
/*Fa�a um programa que carregue um vetor de 5 posi��es, calcule e mostre o somat�rio e o produt�rio
do mesmo.*/
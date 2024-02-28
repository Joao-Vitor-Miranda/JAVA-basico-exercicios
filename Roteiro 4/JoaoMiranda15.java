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
/*Faça um programa que carregue um vetor de 5 posições, calcule e mostre o somatório e o produtório
do mesmo.*/
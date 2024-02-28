import java.util.Scanner;
public class JoaoMiranda11{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int vet[]= new int[10];
      int vet1[]= new int[10];
      int vet2[]= new int[20];
      
      for(int i=0; i<10; i++){
         System.out.print("Digite um valor para o primeiro vetor:");
         vet[i]=ler.nextInt();
         System.out.print("Digite um valor para o segundo vetor:");
         vet1[i]=ler.nextInt();
         }
      int j=10;
      for(int i=0; i<10; i++){
         vet2[i]=vet[i];
         vet2[j]=vet1[i];
         j++;
         }

      for(int i=0; i<20; i++){
        System.out.print(vet2[i]+ "  "); 
      }
   }
  }
/*11. Faça um programa que carregue dois vetores de dez elementos e mostre um terceiro vetor resultante da
intercalação desses dois vetores.*/
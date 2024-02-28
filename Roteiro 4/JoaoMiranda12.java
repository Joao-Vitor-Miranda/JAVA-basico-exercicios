import java.util.Scanner;
public class JoaoMiranda12{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int vet[]= new int[10];
      int vet1[]= new int[10];
      int aux=0,auxx=0;
            
      for(int i=0; i<10; i++){
         System.out.print("Digite um valor:");
         vet[i]=ler.nextInt();
         vet1[i]=vet[i];
         }
      for(int i=0; i<vet.length; i++){
         for(int j=0; j<vet.length; j++){
            if(vet[i] < vet[j]){
            aux=vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
            }
         }
      }
      for(int i=0; i<vet1.length; i++){
         for(int j=0; j<vet1.length; j++){
            if(vet1[i] > vet1[j]){
            auxx=vet1[i];
            vet1[i] = vet1[j];
            vet1[j] = auxx;
            }
         }
      }
      for(int i=0; i<vet.length; i++){
        if(i==0){
        System.out.print("crescente:\n"+vet[i]+ "  ");
        }
        else
        System.out.print(vet[i]+ "  "); 
      }
      for(int i=0; i<vet1.length; i++){
        if(i==0){
        System.out.print("\ndecrescente:\n"+vet1[i]+ "  ");
        }
        else
        System.out.print(vet1[i]+ "  ");
         
      }
      
   }
  }

/*Faça um programa que preencha um vetor com 10 números digitados pelo usuário e em seguida crie e
mostre um vetor ordenado de forma crescente e outro vetor ordenado de forma decrescente.*/
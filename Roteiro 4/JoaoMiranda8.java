import java.util.Scanner;
public class JoaoMiranda8{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int vet1[]= new int[10];
      int vet2[]= new int[10];
      int vet3[]= new int[10];
      
      for(int i=0; i<10; i++){
         System.out.print("Digite um valor para o primeiro vetor:");
         vet1[i]=ler.nextInt();
         System.out.print("Digite um valor para o segundo vetor:");
         vet2[i]=ler.nextInt();
         }
      for(int j=0; j<10; j++){
      
         if(vet1[j]==vet2[j]){
         vet3[j]=1;
         }
         else
         vet3[j]=0;
         }
      for(int j=0;j<10;j++){
      System.out.println(vet3[j]);
      }
      }
   }
/*Construa um programa JAVA que preenche dois vetores reais de 10 posições, depois crie um terceiro
vetor cujo conteúdo de cada posição é: 1, se o número armazenado em uma posição do vetor é o
mesmo armazenado na posição respectiva do 2o, e 0, caso contrário.*/

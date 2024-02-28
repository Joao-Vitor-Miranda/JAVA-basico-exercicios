import java.util.Scanner;
public class JoaoMiranda14{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int vet[]= new int[10];
      int vett[]= new int[10];
      for(int i=0; i<vet.length; i++){
         System.out.print("Digite um valor para o primeiro vetor:");
         vet[i]=ler.nextInt();
         System.out.print("Digite um valor para o segundo vetor:");
         vett[i]=ler.nextInt();
         }
      int vetR[]= new int[10];   
      for(int i=0; i<vetR.length; i++){
         vetR[i]=vet[i]+vett[i];
          System.out.print(vetR[i]+"  ");
      
      }
   }
}

/*Faça um algoritmo em JAVA que preencha dois vetores de 10 posições e exiba um terceiro vetor
resultante em que cada posição é a soma das posições dos outros vetores. Exemplo*/
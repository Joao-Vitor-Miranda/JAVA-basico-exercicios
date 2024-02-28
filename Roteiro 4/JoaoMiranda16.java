import java.util.Scanner;
public class JoaoMiranda16{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int vet[]= new int[10],R=0;;
      for(int i=0; i<vet.length; i++){
         System.out.print("Digite um valor para o vetor:");
         vet[i]=ler.nextInt();
         if(vet[i]==1){
         vet[i]=1;
         }
         else{
            for(int j=1;j<=vet[i];j++){
            if(j==1){
            R=vet[i];
            vet[i]--;
            R=R*vet[i];
            }
            else{
            vet[i]--;
            R=R*vet[i];
            }
            }
            vet[i]=R;}
            }
        for(int i=0; i<vet.length; i++){
        System.out.print(vet[i]+" "); 
        }
   }
}
/*Escreva um algoritmo que leia preencha e mostre um vetor de 10 posições, cada posição é composta
pelo fatorial da mesma.*/

import java.util.Scanner;
import java.util.Random;
public class JoaoMiranda19{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      Random random = new Random();
      
      int vet[]= new int[10],v,j=0;
      
      
      for(int i=0; i<vet.length; i++){
         vet[i]=random.nextInt(100);
         }
      System.out.print("Digite um valor:");
      v=ler.nextInt();
      
      for(int i=0; i<vet.length; i++){
         if(v==vet[i]){
         System.out.println("O valor "+v+" est� na posi��o " +i+" do vetor");
         j++;}
         }
         if(j==0){
         System.out.println("O valor "+v+" n�o est� presente no vetor");} 
          
      for(int i=0; i<vet.length; i++){
      if(i==0){
      System.out.print("\nVetor preenchido: "+vet[i]+" ");}
      else{
      System.out.print(vet[i]+" ");
      } 
      }
   }
}
/*Implemente um algoritmo que preencha com valores inteiros um vetor de 10 posi��es. Em seguida
solicite o usu�rio que digite um valor qualquer e pesquise se o valor informado pelo usu�rio pertence
ou n�o ao vetor preenchido inicialmente. Caso n�o, mostre a mensagem �O valor X n�o est� presente
no vetor�; caso sim, mostre a mensagem �O valor X est� na posi��o Y do vetor�.*/
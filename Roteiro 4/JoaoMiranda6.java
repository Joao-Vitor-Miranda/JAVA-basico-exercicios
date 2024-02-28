import java.util.Scanner;
public class JoaoMiranda6{
   public static void main (String []args){
   Scanner ler = new Scanner(System.in);
   int N[] = new int[100],cj1=0,cj2=0;
   
      for(int i=0;i<100;i++){
      System.out.print("Digite:");
      N[i]=ler.nextInt();
      }
      
      for(int j=0;j<100;j++){
         if(N[j]>=1 && N[j]%2==0){
         cj1++;
         }
         else if(N[j]%2!=0 || N[j]<0){
         cj2++;
         }
      }
      int conj1[] = new int[cj1],conj2[] = new int[cj2];
      int c1=0,c2=0;
      
      for(int j=0;j<100;j++){
         if(N[j]>=1 && N[j]%2==0){
          conj1[c1]=N[j];
          c1++;
         }
         else if(N[j]%2!=0 || N[j]<0){
            conj2[c2]=N[j];
            c2++;
         }
      }
      for(int k=0;k<cj1;k++){
      if(k==0)
      System.out.print("Conjunto 1: "+conj1[k]+" , ");
      
      else if(k==cj1-1)
      System.out.println(conj1[k]);
 
      else
      System.out.print(conj1[k]+" , ");
      }
      for(int k=0;k<cj2;k++){
      if(k==0)
      System.out.print("Conjunto 2: "+conj2[k]+" , ");
      
      else if(k==cj2-1)
      System.out.println(conj1[k]);
      
      else
      System.out.print(conj2[k]+" , ");
      }  
 }
}
/*Leia um conjunto de N números inteiros (N<=100). Faça a divisão destes números em dois outros
conjuntos seguindo a regra: Conjunto 1 – Apenas números positivos e pares e Conjunto 2 – Apenas
números ímpares e/ou negativos.*/
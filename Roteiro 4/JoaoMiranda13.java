import java.util.Scanner;
public class JoaoMiranda13{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int na,nb;
      System.out.println("número de elementos do conjunto A");
      na=ler.nextInt();
         if(na>100){
         System.out.println("operação invalida");
         }
      else{
      int vetA[]= new int[na];   
      for(int i=0;i<vetA.length;i++){
      System.out.println("os elementos do conjunto A");
      vetA[i]=ler.nextInt();   
      }
      System.out.println("número de elementos do conjunto B");
      nb=ler.nextInt();
         if(nb>100){
         System.out.println("operação invalida");
         }
      else{
      int vetB[]= new int[nb];   
      for(int i=0;i<vetB.length;i++){
      System.out.println("os elementos do conjunto B");
      vetB[i]=ler.nextInt();   
      }
            int vetC[] = new int[na+nb],i=0;
            for(int j=0;j<vetC.length;j++){
                 if(j<na){
                 vetC[j]=vetA[j];
                 }
                 else{
                 vetC[j]=vetB[i];
                 i++;
                 }
            }
            int aux=0;
            for(int k=0; k<vetC.length; k++){
               for(int j=0; j<vetC.length; j++){
                  if(vetC[k] < vetC[j]){
                  aux=vetC[k];
                  vetC[k] = vetC[j];
                  vetC[j] = aux;
            }
         }
      }
        for(int k=0; k<vetC.length; k++){
        if(k==0){
        System.out.print("conjunto C:\n"+vetC[k]+ "  ");
        }
        else
        System.out.print(vetC[k]+ "  "); 
      }
     }
     }
   }
  }
/*Intercalação é o processo utilizado para construir uma tabela ordenada, de tamanho n+m, a partir de
duas tabelas já ordenadas de tamanhos n e m. Por exemplo, a partir das tabelas A = {1,3,6,7} e B =
{2,4,5}, construímos a tabela C = {1,2,3,4,5,6,7}. Faça um algoritmo que:
a. Leia NA, número de elementos do conjunto A (NA<=100);
b. Leia, em seguida, os elementos do conjunto A;
c. Leia, após o valor de NB, número de elementos do conjunto B(NB<=100);
d. Leia, finalmente, os elementos do conjunto B;
e. Crie e imprima um conjunto C, ordenado, de tamanho NA + NB, a partir dos conjuntos originais A e
B.
Obs: Considere os elementos de A e B como inteiros e já ordenados.*/

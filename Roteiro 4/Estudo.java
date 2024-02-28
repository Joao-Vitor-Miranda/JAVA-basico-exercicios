import java.util.*;
public class Estudo{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   int vet[]=new int[5],aux=0;
   
   for(int i=0;i<vet.length;i++){
   System.out.println("i");
   vet[i]=ler.nextInt();
   }
   for(int i=0;i<vet.length;i++){
      for(int j=0;j<vet.length;j++){
         if(vet[i]>vet[j]){
         aux=vet[i];
         vet[i]=vet[j];
         vet[j]=aux;
         }
      }
   }
   int cntP=0,n=0;
   
   for(int i=0;i<vet.length;i++){
      for(int j=2;j<=vet[i];j++){
         if(vet[i]%j==0)
         cntP+=1;
      }
      if(cntP==1){
      n++;
      }
      cntP=0;
   }
   int vetP[]=new int[n],k=0;
   if(n>0){
         for(int i=0;i<vet.length;i++){
         for(int j=2;j<=vet[i];j++){
         if(vet[i]%j==0)
         cntP+=1;
            
            if(cntP==1){
            vetP[i]=vet[k];
            k++;
            }
            }
            cntP=0;
         }
   
   }
   }
}
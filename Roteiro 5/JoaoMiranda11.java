import java.util.*;
public class JoaoMiranda11{
   public static void main (String []args){
   Scanner ler = new Scanner(System.in);
   int Nc,k,smC=0,smS=0;
   System.out.println("Digite os numero de cidade:");
   Nc=ler.nextInt();
   
   int vet[][]=new int[Nc][Nc]; 
   for(int i=0;i<vet.length;i++){
      for(int j=0;j<vet[i].length;j++){
      do{
      System.out.println("A cidade "+(i+1)+" tem estrada para a cidade "+(j+1)+" (Sim=1 e não=0):");
      vet[i][j]=ler.nextInt();
      }while(vet[i][j] != 1 && vet[i][j] != 0);}}
      
   System.out.println("Digite uma cidade para sabe quantas estrada chegam e saem:");
   k=ler.nextInt();
   k=k-1;
   for(int j=0;j<vet.length;j++){
      smC+=vet[j][k];
      smS+=vet[k][j];
      }
   System.out.println((smS-1)+" estradas saem é "+(smC-1)+" estradas chegam à cidade:"+(1+k));
   int Mc=0,maior=0,ctt=0,somaI=-1,isolada=0;
   for(int i=0;i<vet.length;i++){
      for(int j=0;j<vet[i].length;j++){
         Mc+=vet[j][i];
      }
       if(i==0 || Mc>maior){
         maior=Mc;
         ctt=i+1;
         Mc=0;
         }
       else{
       Mc=0;}
      }
    System.out.println("A cidade "+ctt+" possuem maior número de estradas chegando");
      for(int i=0;i<vet.length;i++){
         for(int j=0;j<vet[i].length;j++){
         somaI+=vet[i][j];}
            if(somaI==0){
            somaI=-1;
               for(int p=0;p<Nc;p++){
               somaI+=vet[p][i];
               }
                  if(somaI==0){
                  isolada++;
                  }}
               
                  else
                  somaI=-1;
            }
        if(isolada>=1)
        System.out.println("existe "+isolada+" cidade isoladas");    
   }
}
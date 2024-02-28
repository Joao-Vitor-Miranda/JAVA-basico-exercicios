import java.util.*;
public class JoaoMiranda8{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int n;
   System.out.println("Digite qual e a  dimensão quadrada:");
   n=ler.nextInt();
   int vet[][]=new int[n][n],nul=0,um=0,ok=0;
   
      for(int i=0; i<vet.length; i++){
         for(int j=0; j<vet[i].length; j++){
         System.out.println("Digite a matriz:");
         vet[i][j]=ler.nextInt();}}
         
       for(int i=0; i<vet.length; i++){
         for(int j=0; j<vet[i].length; j++){
            if(vet[i][j]==0)
            nul++;
            else if(vet[i][j]==1)
            um++;
         }
            if(um==1){
               if(nul==(n-1))
               ok++;
               nul=0;
               um=0;
            }
         }
      if(ok==n)
      System.out.println("é uma matriz permutação");
      
      else 
      System.out.println("não é uma matriz permutação");  
  }
  }

/*Uma matriz quadrada de dimensão n é dita uma matriz permutação se em cada linha e em cada coluna
houver n-1 elementos nulos e um único elemento igual à 1. Dada uma matriz digitada pelo usuário,
informe se a mesma é ou não uma matriz permutação.*/
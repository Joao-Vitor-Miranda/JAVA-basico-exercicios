import java.util.*;
public class JoaoMiranda8{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int n;
   System.out.println("Digite qual e a  dimens�o quadrada:");
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
      System.out.println("� uma matriz permuta��o");
      
      else 
      System.out.println("n�o � uma matriz permuta��o");  
  }
  }

/*Uma matriz quadrada de dimens�o n � dita uma matriz permuta��o se em cada linha e em cada coluna
houver n-1 elementos nulos e um �nico elemento igual � 1. Dada uma matriz digitada pelo usu�rio,
informe se a mesma � ou n�o uma matriz permuta��o.*/
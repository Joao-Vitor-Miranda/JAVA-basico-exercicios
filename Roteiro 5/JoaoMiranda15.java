import java.util.*;
public class JoaoMiranda15{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   double vet[][]= new double[5][4],Q,sm=0;
   
   for(int i=0;i<vet.length;i++){
      for(int j=0;j<vet[i].length;j++){
      if(j==0){
      System.out.println("Manicure "+(i+1)+" Quantidade de servi�os realizados(unha dos p�s):");
      Q=ler.nextDouble();
      vet[i][j]=Q*5;
      sm+=vet[i][j];
      }
      else if(j==1){
      System.out.println("Manicure "+(i+1)+" Quantidade de servi�os realizados(unha das m�os):");
      Q=ler.nextDouble();
      vet[i][j]=Q*7.5;
      sm+=vet[i][j];
      }
      else if(j==2){
      System.out.println("Manicure "+(i+1)+" Quantidade de servi�os realizados(unha dos p�s):");
      Q=ler.nextDouble();
      vet[i][j]=Q*15;
      sm+=vet[i][j];
      }
      else if(j==3) {
      vet[i][j]=sm;
      }
      }
      }
      for(int i=0; i<vet.length; i++){
        for(int j=0; j<vet[i].length; j++){
         if(j==0)
         System.out.print("Manicure "+(i+1)+" unha dos p�s valor a receber R$: "+vet[i][j]);
         else if(j==1)
         System.out.print("  unha das m�os valor a receber R$: "+vet[i][j]);
         else if(j==2)
         System.out.print("  servi�o de podologia valor a receber R$: "+vet[i][j]);
         else if(j==3)
         System.out.print("  total a receber R$: "+vet[i][j]);
         }
         System.out.println(""); 
   }
}}

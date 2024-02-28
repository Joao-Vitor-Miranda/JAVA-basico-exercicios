import java.util.*;
public class Smurfs{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int N;
   System.out.println("Digite o numero de chuteira individuais entregues: ");
   N=ler.nextInt();
   int M[]= new int[N];
   String L[]=new String[N];
   int aux=0,auxx=0,qtt=0;
   
   
   for(int i=0; i<N; i++){
         System.out.println("Digite o numero da chuteira:");
         M[i]=ler.nextInt();
         System.out.println("Indica se a chuteira é do pé Direito(use a letra D para representar) ou Esquerdo(use a letra E para representar): ");
         L[i]=ler.next();
         ler.nextLine();
         }
         for(int i=0;i<N;i++){
         if(L[i].equals("D") || L[i].equals("d")){
         aux++;
         }
         else if(L[i].equals("E") || L[i].equals("e")){
         auxx++;
         }
         }
         int vetP[]=new int[aux];
         int vetI[]=new int[auxx];
         int cP=0,cI=0;
         for(int i=0;i<N;i++){
         if(L[i].equals("D") || L[i].equals("d")){
         vetP[cP]=M[i];
         cP++;
         }
         else if(L[i].equals("E") || L[i].equals("e") ){
         vetI[cI]=M[i];
         cI++;
         }
         } 
         Arrays.sort(vetP);
         Arrays.sort(vetI); 
         
         for(int i=0;i<aux;i++){
            for(int j=0;j<auxx;j++){
               if(vetP[i]==vetI[j]){
               qtt++;
               vetI[j]=-100;
               j=auxx;
               }
            }}
          System.out.println("O numero de pares correto é: "+qtt);      
   }
 }
import java.util.*;
public class JoaoMiranda17{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int vet[][]=new int[5][5];
   int vetA[]=new int[5],R,sm=0;
      for(int i=0;i<5;i++){
         for(int j=i;j<5;j++){
            if(i==j){
            vet[i][j]=0;}
            else{
               do{
               System.out.println((i+1)+" é amigo do "+(j+1)+" ?(1=sim 0=nao)");
               R=ler.nextInt();
               }while(R!=0 && R!=1);
               vet[i][j]=R;
               vet[j][i]=R;
            }
      }}
      
      for(int i=0;i<5;i++){
         for(int j=0;j<5;j++){
            if(vet[i][j]==1)
            sm+=vet[i][j];
            }
            System.out.println((i+1)+" Tem "+sm+" amigos");
            sm=0;
            }
   }
}
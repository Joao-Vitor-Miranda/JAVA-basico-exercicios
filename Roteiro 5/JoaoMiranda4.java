import java.util.Scanner;
public class JoaoMiranda4{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   int s,sm=0,md=0,ac=0;
   System.out.print("Digite o número de semana: ");
   s=ler.nextInt();
   float vet[][] = new float [s][7];
      
      for(int i=0;i<vet.length;i++){
         for(int j=0;j<vet[i].length;j++){
         System.out.print("Semana "+(i+1)+" Dia "+(j+1)+": ");
         vet[i][j]=ler.nextFloat();
         sm+=vet[i][j];
         }
      }
      md=sm/(s*7);
      
      for(int i=0;i<vet.length;i++){
         for(int j=0;j<vet[i].length;j++){
         int cnt=0;
            if(vet[i][j]>md){
            ac++;}
            else{
                  if(cnt==0){
                  System.out.print("\nSemana "+(i+1)+"..........Dia "+(j+1));
                  cnt++;
                  }
                  else
                  System.out.print(",Dia "+(j+1));
            
            }
            }}
      System.out.println("\nProduçao media: "+md+"\nNúmero de dias com produção acima da média: "+ac);
      
   }
}
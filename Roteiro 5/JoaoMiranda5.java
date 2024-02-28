import java.util.Scanner;
public class JoaoMiranda5{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float vetM[] = new float [3];
   float vet[][] = new float [3][5],sm=0;
   String vetN[] = new String [3];
      for(int i=0;i<vet.length;i++){
      System.out.print("Nome do aluno: ");
         vetN[i]=ler.nextLine();
         for(int j=0;j<vet[i].length;j++){
         System.out.println("Nota do "+vetN[i]+" da prova "+(j+1));
         vet[i][j]=ler.nextFloat();
         sm+=vet[i][j];
         }
         ler.nextLine();
         vetM[i]=sm/5;
         sm=0;
      }  
        for(int i=0;i<vetM.length;i++){
        System.out.println("aluno: "+vetN[i]+"\nmédia: "+vetM[i]);
            if(vetM[i]>=7)
            System.out.println("Aprovado");
            
            else if(vetM[i]<4)
            System.out.println("Reprovado");
            
            else if(vetM[i]>=4 && vetM[i]<7)
            System.out.println("Exame Especial");
         }
          
   }
}
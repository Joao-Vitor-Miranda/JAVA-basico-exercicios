import java.util.Scanner;
public class JoaoMiranda6{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float vetD[][] = new float [6][20];
   float vet[][] = new float [6][20],md=0,sm=0;
   int k=0;   
      for(int i=0;i<vet.length;i++){
         for(int j=0;j<vet[i].length;j++){
         System.out.print("linha: "+(i+1)+" Amostra: "+(j+1)+": ");
         vet[i][j]=ler.nextFloat();
         }
      }
      for(int i=0;i<vetD.length;i++){
         for(int j=0;j<vetD[i].length;j++){
         vetD[i][j]=390-vet[i][j];
            if(vetD[i][j]<0){
            vetD[i][j]*=-1;
               sm+=vetD[i][j];
               if(vet[i][j]<385 || vet[i][j]>395){
               k++;
               System.out.println("linha "+(i+1)+ "  de produção precisa ser revisada");}
            }
           else{
           sm+=vetD[i][j];
               if(vet[i][j]<385 || vet[i][j]>395){
               k++;
               if(k==1)
               System.out.println("linha "+(i+1)+ "  de produção precisa ser revisada");}
               
               }
            }
         }
         for(int i=0;i<vetD.length;i++){
            for(int j=0;j<vetD[i].length;j++){
            System.out.println("linha "+(i+1)+ " Amostra "+(j+1)+" Desvio padrão: "+ vetD[i][j]);  
            }}
         md=sm/120;
         System.out.print("Media do desvio: "+md);
          
}
}
/*O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à
média. Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores
altos indicam maior dispersão dos dados. O gerente de produção da Refrigerator Tabajará está avaliando
o processo de fabricação de seus refrigerantes em lata, especificamente a etapa de preenchimento do
conteúdo. As latas devem possuir 390 ml, com desvio padrão de + ou – 5 ml. Na análise foram coletadas
20 amostras aleatórias das 6 linhas de produção da fábrica, medindo-se a quantidade de produto das
mesmas. Você é o programador da empresa, e ficou incumbido de implementar um programa que auxilie
seu gerente, mostrando ao mesmo a média e o desvio padrão de cada linha de produção. Além disso,
exiba, se for o caso, qual das linhas de produção precisa ser revisada.*/
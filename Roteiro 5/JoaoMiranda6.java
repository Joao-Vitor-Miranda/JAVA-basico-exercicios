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
               System.out.println("linha "+(i+1)+ "  de produ��o precisa ser revisada");}
            }
           else{
           sm+=vetD[i][j];
               if(vet[i][j]<385 || vet[i][j]>395){
               k++;
               if(k==1)
               System.out.println("linha "+(i+1)+ "  de produ��o precisa ser revisada");}
               
               }
            }
         }
         for(int i=0;i<vetD.length;i++){
            for(int j=0;j<vetD[i].length;j++){
            System.out.println("linha "+(i+1)+ " Amostra "+(j+1)+" Desvio padr�o: "+ vetD[i][j]);  
            }}
         md=sm/120;
         System.out.print("Media do desvio: "+md);
          
}
}
/*O desvio padr�o de uma amostra de dados calcula o quanto de varia��o existe da amostra em rela��o �
m�dia. Valores baixos indicam que os dados tendem a estar pr�ximos � m�dia, por outro lado, valores
altos indicam maior dispers�o dos dados. O gerente de produ��o da Refrigerator Tabajar� est� avaliando
o processo de fabrica��o de seus refrigerantes em lata, especificamente a etapa de preenchimento do
conte�do. As latas devem possuir 390 ml, com desvio padr�o de + ou � 5 ml. Na an�lise foram coletadas
20 amostras aleat�rias das 6 linhas de produ��o da f�brica, medindo-se a quantidade de produto das
mesmas. Voc� � o programador da empresa, e ficou incumbido de implementar um programa que auxilie
seu gerente, mostrando ao mesmo a m�dia e o desvio padr�o de cada linha de produ��o. Al�m disso,
exiba, se for o caso, qual das linhas de produ��o precisa ser revisada.*/
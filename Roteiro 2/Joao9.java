import java.util.Scanner;
public class Joao9{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   double val,ano,taxa,R;
   
   System.out.println("Valor de tabela do carro:");
   val=ler.nextDouble();
   System.out.println("Ano:");
   ano=ler.nextDouble();

   
      if (ano<=1990){
      taxa=0.015;
      }
    
      else {
      taxa=0.01;
      }
      
      R=val*taxa;
    
    System.out.printf("Ano de fabrica��o:%.2f\nPre�o do carro:%.2f\nValor do imposto:%.2f",ano,val,R);
   }
}

/*Na cidade de Sabar�, para transfer�ncias de ve�culos, a SABATRAN cobra uma taxa de 1% para carros
fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa est�
incidindo sobre o valor de tabela do carro. Implemente um algoritmo que l� o ano de fabrica��o e o pre�o
do carro e a seguir calcula e imprime imposto a ser pago.*/
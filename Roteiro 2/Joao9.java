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
    
    System.out.printf("Ano de fabricação:%.2f\nPreço do carro:%.2f\nValor do imposto:%.2f",ano,val,R);
   }
}

/*Na cidade de Sabará, para transferências de veículos, a SABATRAN cobra uma taxa de 1% para carros
fabricados antes de 1990 e uma taxa de 1.5% para os fabricados de 1990 em diante. Essa taxa está
incidindo sobre o valor de tabela do carro. Implemente um algoritmo que lê o ano de fabricação e o preço
do carro e a seguir calcula e imprime imposto a ser pago.*/
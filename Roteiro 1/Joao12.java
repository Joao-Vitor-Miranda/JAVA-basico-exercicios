import java.util.Scanner;
public class Joao12 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   double A,B,C,Rab,Meta,R;
   
   System.out.println("Digite a meta:(KM)");
   Meta=ler.nextDouble();
   System.out.println("Digite os valores das medidas da Rua A e B:(KM)");
   A=ler.nextDouble();
   B=ler.nextDouble();
   
   Rab=(Math.pow(A,2))+(Math.pow(B,2));
   C=Math.sqrt(Rab);
   
   R=Meta/(A+B+C);
  
   
   System.out.printf("quantas voltas e preciso fazer no quarteirão para que atinja sua meta:%.2f voltas",R);
   }
}
/*
Dona Maria das Couve é uma mulher muito preocupada com sua saúde e busca a prática de exercícios
físicos constantes. Devido a crise financeira, Dona Maria está sem dinheiro para pagar academia, e teve
como alternativa fazer caminhada diária ao redor do quarteirão de sua casa. O quarteirão da casa dela
possui formato de um triângulo retângulo (figura abaixo), sabendo que ela deve caminhar um valor fixo de
km por dia e dadas as medidas das ruas A e B (em metros) da figura abaixo, calcule e mostre quantas
voltas Dona Maria precisa fazer no quarteirão para que ela atinja sua meta.
*/
public class Joao22{
   public static void main (String []args){
   double paisA=500000,paisB=700000;
   int ano=2015;
    
      while (paisA<paisB){
      paisA=paisA*1.03;
      paisB=paisB*1.02;
      ano++;
   }
   System.out.println("O ano que a população do país A ultrapassará a população de B e:"+ano);
 }
}
/*Sabe-se que um país A possui 500000 habitantes e uma taxa de natalidade de 3% ao ano, já o país B
possui 700000 habitantes e uma taxa de natalidade de 2% ao ano. Escreva um algoritmo, sabendo que
estamos no ano de 2015, que calcule em que ano a população do país A ultrapassará a população de B.*/
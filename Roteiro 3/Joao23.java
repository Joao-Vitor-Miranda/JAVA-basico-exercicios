public class Joao23{
   public static void main (String []args){
   double paisA=500000,paisB=700000;
   int T=0,A=0,B=400000,R;
      while (A<B){
      A+=30;
      B-=40;
      T++;
   }
   R=400000-B;
   System.out.printf("São necessário %d segundos\n",T);
   System.out.println("a locomotiva A deve percorrer:"+A+" metros\na locomotiva B deve percorrer:"+R+" metros");
 }
}
/*Considere uma linha ferroviária entre São Paulo e Curitiba. Suponha que uma locomotiva (trem) A parte
de São Paulo para Curitiba com velocidade de 30 m/s enquanto que uma outra locomotiva B parte de
Curitiba para São Paulo no mesmo instante com velocidade de 40 m/s. Considere a distância entre São
Paulo e Curitiba de 400 Km. Considere também que as linhas férreas são paralelas. Implemente um
algoritmo que calcule iterativamente o tempo em que as locomotivas se cruzarão no caminho. O
algoritmo deve calcular também a distância que as locomotivas devem percorrer até o momento do
cruzamento.*/
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
   System.out.printf("S�o necess�rio %d segundos\n",T);
   System.out.println("a locomotiva A deve percorrer:"+A+" metros\na locomotiva B deve percorrer:"+R+" metros");
 }
}
/*Considere uma linha ferrovi�ria entre S�o Paulo e Curitiba. Suponha que uma locomotiva (trem) A parte
de S�o Paulo para Curitiba com velocidade de 30 m/s enquanto que uma outra locomotiva B parte de
Curitiba para S�o Paulo no mesmo instante com velocidade de 40 m/s. Considere a dist�ncia entre S�o
Paulo e Curitiba de 400 Km. Considere tamb�m que as linhas f�rreas s�o paralelas. Implemente um
algoritmo que calcule iterativamente o tempo em que as locomotivas se cruzar�o no caminho. O
algoritmo deve calcular tamb�m a dist�ncia que as locomotivas devem percorrer at� o momento do
cruzamento.*/
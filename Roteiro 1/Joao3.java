import java.util.Scanner;
public class Joao3{
   public static void main(String [] args){
      Scanner ler = new Scanner (System.in);
      float n1,n2,n3,R;
      
      System.out.println("Digite 3 n�mero");
      n1=ler.nextFloat();
      n2=ler.nextFloat();
      n3=ler.nextFloat();
      R=(n1*n2)/n3;

      System.out.print("O resultado da multiplica��o dos dois primeiros n�meros dividido pelo terceiro n�mero �: "+ R);
      
   }
}
/*
Implemente um algoritmo que receba 3 n�meros reais de entrada. Calcule e mostre o resultado da
multiplica��o dos dois primeiros n�meros dividido pelo terceiro n�mero fornecido pelo usu�rio. Sabe-se
que o denominador n�o pode ser zero, mas neste momento n�o se preocupe com as valida��es.
*/
import java.util.Scanner;
public class Joao3{
   public static void main(String [] args){
      Scanner ler = new Scanner (System.in);
      float n1,n2,n3,R;
      
      System.out.println("Digite 3 número");
      n1=ler.nextFloat();
      n2=ler.nextFloat();
      n3=ler.nextFloat();
      R=(n1*n2)/n3;

      System.out.print("O resultado da multiplicação dos dois primeiros números dividido pelo terceiro número é: "+ R);
      
   }
}
/*
Implemente um algoritmo que receba 3 números reais de entrada. Calcule e mostre o resultado da
multiplicação dos dois primeiros números dividido pelo terceiro número fornecido pelo usuário. Sabe-se
que o denominador não pode ser zero, mas neste momento não se preocupe com as validações.
*/
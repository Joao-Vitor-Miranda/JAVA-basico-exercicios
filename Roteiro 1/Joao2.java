import java.util.Scanner;
public class Joao2{
   public static void main(String [] args){
      Scanner ler = new Scanner (System.in);
      int num,numS,numA;
      
      System.out.println("Digite um número");
      num=ler.nextInt();
      numS=num+1;
      numA=num-1;
      System.out.printf("seu antecessor: %d\nseu sucessor: %d",numA,numS);
      
   }
}
      
//Implemente um algoritmo que leia um número inteiro e imprima seu antecessor e seu sucessor.

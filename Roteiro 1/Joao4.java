import java.util.Scanner;
public class Joao4{
   public static void main(String [] args){
      Scanner ler = new Scanner (System.in);
      float n1, n2, n3, p1, p2, p3, mediaPonderada;
      
      System.out.println("Digite a notas e seu respectivos peso");
      n1=ler.nextFloat();
      p1=ler.nextFloat();
      System.out.println("Digite a notas e seu respectivos peso");
      n2=ler.nextFloat();
      p2=ler.nextFloat();
      System.out.println("Digite a notas e seu respectivos peso");
      n3=ler.nextFloat();
      p3=ler.nextFloat();
      
      mediaPonderada=(n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
      
      

      System.out.printf("A media ponderada é:%.2f",mediaPonderada);
      
   }
}
/*
Faça um algoritmo que receba 3 notas e seus respectivos pesos, calcule e mostre a media ponderada dessas
notas.
*/
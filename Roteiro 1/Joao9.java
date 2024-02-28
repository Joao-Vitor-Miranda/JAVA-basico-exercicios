import java.util.Scanner;
public class Joao9 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float nD,n;
   
   System.out.println("Digite o número de lados do polígono.");
   n=ler.nextFloat();
   
   nD=n*(n-3)/2;
   System.out.printf("número de diagonais desse polígono é:%.2f",nD);
   }
}

import java.util.Scanner;
public class Joao9 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float nD,n;
   
   System.out.println("Digite o n�mero de lados do pol�gono.");
   n=ler.nextFloat();
   
   nD=n*(n-3)/2;
   System.out.printf("n�mero de diagonais desse pol�gono �:%.2f",nD);
   }
}

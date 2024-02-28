import java.util.Scanner;
public class Bl{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int n,d=0,inv=0;
      String nome;
      nome=ler.nextLine();
      do{
         n=ler.nextInt();
         if(n!=-1){
           d=n%10;
           n=n/10;
           inv=inv*10+d;}
           }
           while(n!=-1);
           System.out.println(inv);
           }
           }
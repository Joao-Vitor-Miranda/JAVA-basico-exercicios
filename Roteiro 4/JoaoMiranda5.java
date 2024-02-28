import java.util.Scanner;
public class JoaoMiranda5{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      double veth[]=new double[20],md=0,sm=0; 
      String vetn[]=new String[20];           
      for(int i=0;i<20;i++){
      System.out.println("Nome e altura:");
      vetn[i]=ler.nextLine();
      veth[i]=ler.nextDouble();
      ler.nextLine();
      sm+=veth[i];
      }
      md=sm/4; 
      for(int j=0;j<20;j++){
         if(veth[j]>=md){
         System.out.println(vetn[j]+" pode participar da competição ");
         }
      }    
   }
}
/*Em uma competição somente atletas que possuem altura maior ou igual a média geral das alturas dos
inscritos podem participar. Sabe-se que a organização recebeu 20 inscrições. Faça um programa que
identifique e mostre quais atletas podem participar da competição.*/
import java.util.Scanner;
public class Joao1 {
   public static void main (String [] args){
    Scanner ler = new Scanner (System.in);
    float n1,n2,n3,soma,media;
        
    System.out.println("Escreva 3 números:");
    n1=ler.nextFloat();
    n2=ler.nextFloat();
    n3=ler.nextFloat();
    
    soma=n1+n2+n3;
    media=(n1+n2+n3)/3;

    System.out.printf("Soma:%.1f  media:%.1f",soma,media);

    
      
   
   }
}
   
//Crie um algoritmo que calcule a soma e a média de 3 números passados pelo usuário.
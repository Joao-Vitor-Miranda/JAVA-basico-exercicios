import java.util.Scanner;
public class Joao13{
   public static void main (String []args){
   int n,i,sP=0,sNP=0;
    Scanner ler = new Scanner (System.in);
      System.out.print("Digite um numero: ");
      n=ler.nextInt();
      for(i=2;i<n;i++){
      if (n%i==0){
      sNP++;
      }
      else
      sP++;
      }
    
    if(n!=1){
       if (sNP==0)
       System.out.printf("%d � primo",n);
       else
       System.out.printf("%d n�o e primo",n);
       }
    else
    System.out.printf("%d n�o e primo",n);
    
    }             
 }

/*Faça um algoritmo para identificar se um determinado número fornecido pelo usuário é primo ou não.
Lembrando que um número primo só é divisível por 1 e por ele mesmo, ou seja, possui somente 2
divisores. Exemplos: 2, 5, 7, etc.*/
import java.util.Scanner;
public class JoaoMiranda10{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int a[]= new int[10];

      for(int i=0; i<10; i++){
         System.out.print("Digite um valor para o vetor:");
         a[i]=ler.nextInt();
         }
      double R=0,S=0;
      int j,k=9;
      for(j=0; j<5; j++){
         R=Math.pow((a[j]-a[k]),2);
         S+=R;
         k--;           
         }
      System.out.print(S);
      }
   }
/*Faça um programa que preencha um vetor A de 10 posições e calcule o valor de S da seguinte forma:

S = (a[0] - a[9]) 2 + (a[1] - a[8])2 + (a[2] - a[7])2 + (a[3] - a[6])2 + (a[4] - a[5])2*/
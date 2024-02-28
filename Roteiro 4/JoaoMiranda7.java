import java.util.Scanner;
public class JoaoMiranda7{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int[] vetF = new int[80];
      int [] vetR= new int [80];
      int nota;
      int novo;
      
      for(int i=0; i<80; i++){
         
         do{
         System.out.print("Digite a nota:");
         nota = ler.nextInt();
         if(nota < 0 || nota>10)
         System.out.print("Nota ínvalida");
         }
         while(nota < 0 || nota >10);
         
         vetF[nota]++;
         }
         
         for(int i=0; i< vetF.length; i++){
         System.out.print("Media absoluta e: "+vetF[i]);
         System.out.print("Media relativa e: " +vetR[i]/10);
         }
      
      }

   }

/*Fazer um algoritmo que:
a. Leia um conjunto de valores inteiros correspondentes a 80 notas dos alunos de uma turma, notas
estas que variam de 0 a 10 (valide as entradas);
b. Calcule a frequência absoluta e a frequência relativa de cada nota;
c. Imprima uma tabela contendo os valores das notas (de 0 a 10) e suas respectivas frequências
absoluta e relativa.*/
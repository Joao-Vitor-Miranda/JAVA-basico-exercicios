import java.util.Scanner;
public class Joao11{
   public static void main (String []args){
   int n,i;
   double nota,nm=0,nM=0,nn=0,sm=0,media=0;
   String nome,nomeM=null,nomem=null;
    Scanner ler = new Scanner (System.in);
      System.out.print("Digite quantas notas tem: ");
      n=ler.nextInt();
      for(i=1;i<=n;i++){
         System.out.print("Digite a nota: ");
         nota=ler.nextDouble();
         ler.nextLine();
         System.out.print("Digite o nome: ");
         nome=ler.nextLine();
         sm+=nota;
         
         if(i==1){
            nM=nota;
            nm=nota;
            nomeM=nome;
            nomem=nome;
         }
         
         else if(nota>=nM){
            nM=nota;
            nomeM=nome;
            }
         else if (nota<=nm){
            nm=nota;
            nomem=nome;
            }
      }
      media=sm/n;
      System.out.printf("maior nota:%.2f|nome:%s\nmenor nota:%.2f|nome:%s\nsoma das notas:%.2f|media:%.2f",nM,nomeM,nm,nomem,sm,media);
             
 }
}
/*Faça um programa que leia a nota e o nome de N alunos na prova de algoritmos e imprima a maior e a
menor nota computada e qual aluno tirou tais notas. Além disso, calcule e imprima também a soma e a
média de todas as notas.*/
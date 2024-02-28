import java.util.Scanner;
public class Joao10{
   public static void main (String []args){
   int n,i;
   double nota,nm=0,nM=0,nn=0;
    Scanner ler = new Scanner (System.in);
      System.out.print("Digite quantas notas tem: ");
      n=ler.nextInt();
      for(i=1;i<=n;i++){
         System.out.print("Digite a nota: ");
         nota=ler.nextDouble();
         
         if(i==1){
            nM=nota;
            nm=nota;
         }
         
         else if(nota>=nM){
            nM=nota;
            }
         else if (nota<=nm){
            nm=nota;
            }
      }
      System.out.printf("maior nota:%.2f\nmenor nota:%.2f",nM,nm);        
 }
}
/*Implemente um algoritmo que receba de entrada N valores digitados pelo usuário. Dentre os valores
digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.*/
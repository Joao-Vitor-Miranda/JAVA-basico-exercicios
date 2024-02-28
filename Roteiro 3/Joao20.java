import java.util.Scanner;
public class Joao20{
   public static void main (String []args){
   int num,ip=0,maiorPar=0,ii=0,maiorImpar=0,Sp=0,Si=0;
   float mediaP,mediaI;
   Scanner ler = new Scanner (System.in);

      do{
      System.out.println("Digite");
      num=ler.nextInt();
       if(num > -1){
         if(num%2==0){
            if(ip==0){
            maiorPar=num;
            Sp+=num;
            ip++;
            }
            else if(num>maiorPar){
            maiorPar=num;
            Sp+=num;
            ip++;
            }
            else{
            Sp+=num;
            ip++;
            }  
         }
         else{
            if(ii==0){
            maiorImpar=num;
            Si+=num;
            ii++;
            }
            else if(num<maiorImpar){
            maiorImpar=num;
            Si+=num;
            ii++;
            }
            else{
            Si+=num;
            ii++;
            }
         }
       }        
      }
      while(num>=-1);
      mediaP=Sp/ip;
      mediaI=Si/ii;
      System.out.println("Manor número Ímpar: "+maiorImpar);
      System.out.println("Maior número Par: "+maiorPar);
      System.out.println("média dos valores PARES: "+mediaP);
      System.out.println("média de valores ÍMPARES: "+mediaI);
      
  }    
} 
/*Construa um algoritmo para calcular a média de valores PARES e ÍMPARES, que serão digitados pelo
usuário. Ao final o algoritmo deve mostrar estas duas médias bem como o maior número PAR e o menor
número ÍMPAR digitado. O algoritmo finaliza quando o usuário digitar um valor negativo.*/
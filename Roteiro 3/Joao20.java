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
      System.out.println("Manor n�mero �mpar: "+maiorImpar);
      System.out.println("Maior n�mero Par: "+maiorPar);
      System.out.println("m�dia dos valores PARES: "+mediaP);
      System.out.println("m�dia de valores �MPARES: "+mediaI);
      
  }    
} 
/*Construa um algoritmo para calcular a m�dia de valores PARES e �MPARES, que ser�o digitados pelo
usu�rio. Ao final o algoritmo deve mostrar estas duas m�dias bem como o maior n�mero PAR e o menor
n�mero �MPAR digitado. O algoritmo finaliza quando o usu�rio digitar um valor negativo.*/
import java.util.Scanner;
public class Joao19{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   
   double num,pq,pc,rq,rc;
   
   System.out.println("Entre com um numero");
   num=ler.nextDouble();
   
   pq=Math.pow(num,2);
   pc=Math.pow(num,3);
   rq=Math.sqrt(num);
   rc=Math.cbrt(num);  
   
   System.out.printf("O n�mero digitado elevado ao quadrado:%.0f\nO n�mero digitado elevado ao cubo:%.0f\nA raiz quadrada do n�mero;%.0f\nA raiz c�bica do n�mero:%.0f",pq,pc,rq,rc);
   
   } 
}
/*Implemente m programa que receba um n�mero positivo, calcule e mostre:
 O n�mero digitado elevado ao quadrado:
 O n�mero digitado elevado ao cubo:
 A raiz quadrada do n�mero;
 A raiz c�bica do n�mero:*/
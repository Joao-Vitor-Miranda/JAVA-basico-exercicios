import java.util.Scanner;
public class Joao11 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float sal,cont1,cont2;
   double R;
   
   System.out.println("Digite o salario");
   sal =ler.nextFloat();
   System.out.println("Digite o valor da primeira conta:");
   cont1 =ler.nextFloat();
   System.out.println("Digite o valor da segunda conta:");  
   cont2 =ler.nextFloat();
 
   R=((cont1*1.02) + (cont2*1.02))-sal;
   System.out.printf("Restar� do sal�rio:%.2f",R);
   }
}
/*Jo�o recebeu seu sal�rio e precisa pagar 2 contas atrasadas. Em raz�o do atraso, ele dever� pagar multa de
2% sobre cada conta. Fa�a um programa que receba o sal�rio do Jo�o e o valor de cada conta, calcule e
mostre quanto restar� de sal�rio ap�s o pagamento das duas contas.
*/
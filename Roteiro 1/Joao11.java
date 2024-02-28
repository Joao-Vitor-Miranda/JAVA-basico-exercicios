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
   System.out.printf("Restará do salário:%.2f",R);
   }
}
/*João recebeu seu salário e precisa pagar 2 contas atrasadas. Em razão do atraso, ele deverá pagar multa de
2% sobre cada conta. Faça um programa que receba o salário do João e o valor de cada conta, calcule e
mostre quanto restará de salário após o pagamento das duas contas.
*/
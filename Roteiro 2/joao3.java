import java.util.Scanner;
public class joao3{
	public static void main(String[] args) {

		double num1, num2;

		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva um numero: ");
		num1 = ler.nextDouble();
      num2 = ler.nextDouble();

		if (num1<num2){
      num1=Math.pow(num1,2);
      num2=Math.sqrt(num2);
		System.out.println("A Potencialização é:" + num1 + " E a Racionalizão é:" + num2);
      }
      
		else if (num2<num1){
      num2=Math.pow(num2,2);
      num1=Math.sqrt(num1);
		System.out.println("A Potencialização é:" + num2 + " E a Racionalizão é:" + num1);
      }

		else
		System.out.println("Os números são iguais");

	}
}


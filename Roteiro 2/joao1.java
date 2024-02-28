import java.util.Scanner;
public class joao1 {
	public static void main(String[] args) {

		double num;

		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva um numero: ");
		num = ler.nextDouble();

		if (num>=1)
		System.out.println("Positivo");
      
      else if (num==0)
      System.out.println("Zero");
      
		else
		System.out.println("Negativo");

	}
}
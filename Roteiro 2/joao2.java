import java.util.Scanner;
public class joao2 {
	public static void main(String[] args) {

		double num;

		Scanner ler = new Scanner(System.in);

		System.out.println("Escreva um numero: ");
		num = ler.nextDouble();

		if (num%2==0&&num>=1)
		System.out.println("Par");

		else if (num==0)
			System.out.println("Nulo");

		else
		System.out.println("Impar");

	}
}
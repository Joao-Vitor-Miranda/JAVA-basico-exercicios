import java.util.Scanner;
public class Joao24 {

    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	int a, b, c, R1;

    	System.out.println("A,B,C da equaçao:");

		a=ler.nextInt();
		b=ler.nextInt();
		c=ler.nextInt();
    	R1=(b*b)-4*a*c;


    	double raiz = Math.sqrt(R1),x1, x2, aa;

    	aa=2*a;
    	x1=(-b+raiz)/aa;
		x2=(-b-raiz)/aa;

    	System.out.println("Delta é: "+R1);
    	System.out.println("Raiz do delta: "+raiz);
    	System.out.println("|x1:| " +x1+ "     |x2:| " +x2);

    	if (R1<0)
    		System.out.println("Raiz negativa");
   }
}
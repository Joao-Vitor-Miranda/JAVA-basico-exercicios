import java.util.Scanner;
public class Joao4 {

    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
    	int a, b, c;
      double r,D,r1,r2;
    	System.out.println("A,B,C da equa�ao:");

		a=ler.nextInt();
		b=ler.nextInt();
		c=ler.nextInt();
      
         if (a==0){
         System.out.println("N�o � uma equa��o do segundo grau");
            if(b==0){
            System.out.println("N�o � uma equa��o do primeiro grau");
            }
            else{
            r=-c/b;
            System.out.printf("X=%.1f\n",r);
            }
         }
         
         else {
         D=(b*b)-4*a*c;
            if (D<0){
            System.out.print("N�o h� ra�zes reais");
            }
            else{
            r1=(-b-Math.sqrt(D))/(2*a);
            r2=(-b+Math.sqrt(D))/(2*a);
            System.out.println("|x1:| " +r1+ "     |x2:| " +r2);
            }
            
         }    	
    }
}
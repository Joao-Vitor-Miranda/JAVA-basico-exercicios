import java.util.Scanner;
public class Joao13 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   int X,R;
   System.out.println("Digite o ano");
   X=ler.nextInt();
   R=((X-1930)/4)-1;
   
   System.out.printf("O n�mero de copas j� realizadas �:%d",R);
   }
}

/*
A copa do mundo de futebol da FIFA � uma competi��o internacional que iniciou em 1930, acontecendo
desde ent�o de 4 em 4 anos, exceto durante o per�odo das guerras mundiais que impossibilitaram a
realiza��o 2 copas mundiais. Sabendo dessas informa��es, fa�a um algoritmo em JAVA que dado o ano
atual calcule o n�mero de copas j� realizadas e exiba o resultado ao usu�rio.
*/
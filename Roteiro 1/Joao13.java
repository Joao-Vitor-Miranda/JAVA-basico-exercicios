import java.util.Scanner;
public class Joao13 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   int X,R;
   System.out.println("Digite o ano");
   X=ler.nextInt();
   R=((X-1930)/4)-1;
   
   System.out.printf("O número de copas já realizadas é:%d",R);
   }
}

/*
A copa do mundo de futebol da FIFA é uma competição internacional que iniciou em 1930, acontecendo
desde então de 4 em 4 anos, exceto durante o período das guerras mundiais que impossibilitaram a
realização 2 copas mundiais. Sabendo dessas informações, faça um algoritmo em JAVA que dado o ano
atual calcule o número de copas já realizadas e exiba o resultado ao usuário.
*/
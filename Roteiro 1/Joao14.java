import java.util.Scanner;
public class Joao14 {
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   float l1,l2,Area,R;
   
   System.out.println("Digite os valores dos lado maior e do menor do retangulo:(metros)");
   l1=ler.nextFloat();
   l2=ler.nextFloat();
    
   Area=l1*l2; 
   R=Area*18;
     
   System.out.printf("Area:%.2fm\nPot�ncia de ilumina��o necess�ria para iluminar corretamente o c�modo:%.1fw",Area,R);
   }
}
/*
Sabe-se que, para iluminar corretamente os c�modos de uma casa, para cada m2, deve-se usar 18 W de
pot�ncia. Fa�a um programa que receba as dimens�es de um c�modo retangular (em metros), calcule e
mostre a �rea de mesmo (em m2) e a pot�ncia de ilumina��o necess�ria para iluminar corretamente o
c�modo.
*/
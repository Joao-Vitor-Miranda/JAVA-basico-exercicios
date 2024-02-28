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
     
   System.out.printf("Area:%.2fm\nPotência de iluminação necessária para iluminar corretamente o cômodo:%.1fw",Area,R);
   }
}
/*
Sabe-se que, para iluminar corretamente os cômodos de uma casa, para cada m2, deve-se usar 18 W de
potência. Faça um programa que receba as dimensões de um cômodo retangular (em metros), calcule e
mostre a área de mesmo (em m2) e a potência de iluminação necessária para iluminar corretamente o
cômodo.
*/
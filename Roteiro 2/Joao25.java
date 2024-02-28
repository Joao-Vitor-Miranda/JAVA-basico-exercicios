import java.util.Scanner;
public class Joao25{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   double h,p;
   char letra;
   
   System.out.println("Digite o sexo:(M-Masculino ou F-Feminino)");
   letra=ler.nextLine().charAt(0);
   System.out.print("Digite a altura:");
   h=ler.nextDouble();
   
   
      if(letra=='M' || letra=='m'){
      p=(72.7*h)-58;
      }
      
      else{
      p=(62.1*h)-44.7;
      }
      
    System.out.printf("Peso ideal:%.1fKg",p);
      }
}
/*Faça um algoritmo que receba de entrada a altura e o sexo de uma pessoa ('M' - Masculino ou 'F' -
Feminino), construa um algoritmo que calcule o peso ideal da pessoa de acordo com as regras:
- Homens: (72.7*altura) - 58 - Mulher: (62,1*altura) - 44.7*/
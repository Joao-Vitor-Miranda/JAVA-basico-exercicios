import java.util.Scanner;
public class Joao7{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   char letra;
   
   System.out.println("Digite uma letra");
   letra=ler.nextLine().charAt(0);
      if (letra=='a' || letra=='e' ||letra=='i' || letra=='o' || letra=='u'){
      System.out.println("Vogal");
      }
      else 
      System.out.println("n�o � uma vogal"); 
   
    
       }
}
/*Fa�a um programa que solicite ao usu�rio que digite um caracter e em seguida imprima se o caracter
digitado � ou n�o uma vogal.*/
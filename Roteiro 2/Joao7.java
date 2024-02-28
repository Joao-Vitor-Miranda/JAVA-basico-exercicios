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
      System.out.println("não é uma vogal"); 
   
    
       }
}
/*Faça um programa que solicite ao usuário que digite um caracter e em seguida imprima se o caracter
digitado é ou não uma vogal.*/
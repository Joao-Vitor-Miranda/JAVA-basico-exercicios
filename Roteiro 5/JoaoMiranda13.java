import java.util.*;
public class JoaoMiranda13{
   public static void main(String []args){
   Scanner ler = new Scanner(System.in);
   String nome,apelido;
   System.out.println("Digite o seu nome: ");
   nome=ler.nextLine();
   ler.nextLine();
   System.out.println("Digite o seu apelido: ");
   apelido=ler.nextLine();
   length(nome);
   } 
   
   public static void length(){
   int qttL =length();
   System.out.println("quantidade de caracteres no nome completo �: "+qttL);}
   
}
/*Fa�a um programa que leia o nome completo e o apelido de uma pessoa. Imprima: a) quantidade de
caracteres no nome completo da pessoa; b) Concatene o apelido ao nome do usu�rio; c) Verifique se o
nome do usu�rio � igual ao seu apelido. Fun��es da biblioteca string: strcmp, strcat, strlen.*/
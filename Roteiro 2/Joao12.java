import java.util.Scanner;
public class Joao12{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   int id;
   
   System.out.println("Digite a idade:");
   id=ler.nextInt();
   
     if(id>=5 && id<=7){
     System.out.print("Categoria: Infantil");
     }
     else if(id>=8 && id<=10){
     System.out.print("Categoria: Juvenil");
     }
     else if(id>=11 && id<=15){
     System.out.print("Categoria: Adolesente");
     }
     else if(id>=16 && id<=40){
     System.out.print("Categoria: Adulto");
     }
     else if(id>40){
     System.out.print("Categoria: Sênior");
     }
     else{
     System.out.print("Categoria: Sem categoria");
     }

   }
}

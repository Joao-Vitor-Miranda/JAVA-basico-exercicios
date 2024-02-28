import java.util.Scanner;
public class Joao16{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   int dia,ano,Ano,mes,R;
   
   System.out.println("Digite o ano atual:");
   Ano=ler.nextInt();
   
   System.out.println("Digite o Dia do nascimento:");
   dia=ler.nextInt();
   System.out.println("Digite o Mes do nascimento:");
   mes=ler.nextInt();
   System.out.println("Digite o Ano do nascimento:");
   ano=ler.nextInt();   
  
      
   R=Ano-ano;
   
   if (R<16){
   System.out.println("Não vota");
   }
   else if (R>=16 && R<18){
   System.out.println("Facultativo");
   }
   else if (R>70){
   System.out.println("Facultativo");
   }
   else if (R>=18 && R<=70){
   System.out.println("Obrigatório");
   }
   else{
   System.out.println("Erro");
   }

}
}

 

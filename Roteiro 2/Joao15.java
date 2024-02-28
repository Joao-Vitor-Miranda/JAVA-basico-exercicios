import java.util.Scanner;
public class Joao15{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   int dia,ano,Ano,Dia,mes,Mes;
   
   System.out.println("Digite o Dia:");
   dia=ler.nextInt();
   System.out.println("Digite o Mes:");
   mes=ler.nextInt();
   System.out.println("Digite o Ano:");
   ano=ler.nextInt();
   
   System.out.println("Digite o Dia:");
   Dia=ler.nextInt();
   System.out.println("Digite o Mes:");
   Mes=ler.nextInt();
   System.out.println("Digite o Ano:");
   Ano=ler.nextInt();
   
   if (ano>Ano){
      System.out.println(dia+"/"+mes+"/"+ano + " Essa data ea maior");
      }
      
   else if (Ano>ano){
      System.out.println(Dia+"/"+Mes+"/"+Ano + " Essa data ea maior");
      }
      
   else{
        if (Mes<mes){
        System.out.println(Dia+"/"+Mes+"/"+Ano + " Essa data ea maior");
        }
        else if (mes<Mes){
        System.out.println(dia+"/"+mes+"/"+ano + " Essa data ea maior");
        }
        else if (Dia<dia){
        System.out.println(Dia+"/"+Mes+"/"+Ano + " Essa data ea maior");
        }
        else if (dia<Dia){
        System.out.println(dia+"/"+mes+"/"+ano + " Essa data ea maior");
        }
        else {
        System.out.println("Os mêses são iguais");
        }

      }
   }
}
/*Faça um algoritmo que receba duas datas (dia, mês e ano) e determine a maior entre elas. Você deverá
receber as datas no formato de uma String e fazer as devidas comparações. Pesquisem sobre as classes
Date e Calendar.*/ 
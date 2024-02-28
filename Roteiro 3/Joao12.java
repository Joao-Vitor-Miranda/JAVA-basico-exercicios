import java.util.Scanner;
public class Joao12{
   public static void main(String[] args){
   
   int vei, aci, maior = 0, menor = 0, somaAci = 0, somaVei = 0, soma200 = 0, qtd200 = 0,i;
   double mediaVei, media200, razao;
   
   String nomeCid, nomeMaior = null, nomeMenor = null;
   Scanner in = new Scanner(System.in);
   
   for(i =1; i <= 5; i++)
   {
      System.out.println("Digite o nome da " + i + " cidade");
      nomeCid=in.nextLine();
      System.out.println("Digite a quantidade de veiculos de " + nomeCid);
      vei=in.nextInt();
      System.out.println("Digite a quantidade de acidentes de " + nomeCid);
      aci=in.nextInt();
      in.nextLine();
      somaAci+=aci;
   
      if(vei<200)
      {
         soma200 += aci;
         qtd200++;
      }
   
      if(i==1)
      {
         maior=aci;
         nomeMaior=nomeCid;
      
         menor=aci;
         nomeMenor=nomeCid;   
      }
      else
      {
         if(aci>maior)
         {
            maior=aci;
            nomeMaior=nomeCid;
         }
         if(aci<menor)
         {
            menor=aci;
            nomeMenor=nomeCid;         
         }         
      }
   }
   
   mediaVei = somaVei/ 5.0;
   
   if(qtd200 == 0)
   {
      media200 = 0;
   }
   else{
      media200 = (double)soma200 / qtd200;
   }
   
   razao = (double)(somaAci)/somaVei;
   
   System.out.println(nomeMaior + " Teve o maior indice de acidentes");
   System.out.println(nomeMenor + " Teve o menor indice de acidentes");
   System.out.println("A razao da quantidade de acidentes e a quantidade de veiculos e : " + razao);
   
   
 }
}
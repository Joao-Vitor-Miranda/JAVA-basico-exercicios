import java.util.Scanner;
public class JoaoMiranda9{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int vets[]= new int[50];
      double veth[]= new double[50], sm=0 , md=0; 
      String vetn[]=new String[50];
      
      for (int i=0;i < 50;i++){
			System.out.println("Digite o nome:");
			vetn[i]=ler.nextLine();
			System.out.println("Digite 1 se for masculino e 2 se for feminino:");
			vets[i]=ler.nextInt();
         System.out.println("Digite a altura");
			veth[i]=ler.nextDouble();
         ler.nextLine();
         sm+=veth[i];
         }
         md=sm/50;
         System.out.println("A m�dia da turma: " +md);
         
      double maior=0,menor=0;   
      
      for (int i=0;i < 50;i++){
      
         if (i==0){
         maior=veth[i];
         menor=veth[i];
            if(veth[i]<md){
            System.out.println(vetn[i]+" esta com a altura abaixo da m�dia da turma");
            }}
         
         else if(veth[i]<menor){
         menor=veth[i];
            if(veth[i]<md){
            System.out.println(vetn[i]+" esta com a altura abaixo da m�dia da turma");
            }}
         
         else if(veth[i]>maior){
         maior=veth[i];
            if(veth[i]<md){
            System.out.println(vetn[i]+" esta com a altura abaixo da m�dia da turma");
            }}
         else{
            if(veth[i]<md){
            System.out.println(vetn[i]+" esta com a altura abaixo da m�dia da turma");
            }}
      }
      System.out.println("A maior: "+maior+" menor: "+menor+" altura da turma");
      double mdO=0,mdA,smO=0,smA=0,o=0,a=1;
      for (int i=0;i < 50;i++){
         if(vets[i]==1){
         smO+=veth[i];
         o++;}
         
         else{
         smA+=veth[i];
         a++;}
      }
      mdO=smO/o;
      mdA=smA/a;
      for (int i=0;i < 50;i++){
         if(vets[i]==1){
            if(veth[i]<mdA)
            System.out.println(vetn[i]+" com altura abaixo da m�dia da altura das mulheres");
         }
         else{
            if(veth[i]>mdO)
            System.out.println(vetn[i]+" com altura acima da m�dia da altura dos homens");
         }
      }
 }
}

/*Escreva um programa que leia um conjunto de 50 fichas correspondente � alunos e armazene-as em
vetores, cada uma contendo, a altura e o c�digo do sexo de uma pessoa (c�digo = 1 se for masculino e
2 se for feminino), e calcule e imprima:
- A maior, menor e a m�dias das alturas da turma;
- As mulheres com altura acima da m�dia da altura dos homens;
- Os homens com altura abaixo da m�dia da altura das mulheres;
- As pessoas com altura abaixo da m�dia da turma.*/
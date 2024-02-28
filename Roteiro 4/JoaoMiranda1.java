import java.util.Scanner;
public class JoaoMiranda1{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      int sM=0,sm=0,soma=0,md,Anovo=0,Avelho=0;
      int idade[]=new int[3];
      String nome[]=new String[3];
      String Nvelho =" ",Nnovo =" ";
      
         for(int i=0;i<3;i++){
            System.out.println("Digite o seu nome, em seguida digite a idade:");
            nome[i]=ler.nextLine();
            idade[i]=ler.nextInt();
            ler.nextLine();
            soma+=idade[i];
            
                 if(idade[i]>16){
                 sM++;
                 }
                 else{
                 sm++;
                 } 
                     
         }
         md=soma/3;
         System.out.println("Média das idades:"+md+"\tTotal de alunos com idade maior que 16 anos:"+sM+"\tTotal de alunos com idade menor ou igual a 16 anos:"+sm);
         for(int j=0;j<3;j++){
         if(idade[j]>md){
         System.out.println("Alunos com idade acima da média:"+nome[j]+"idade:"+idade[j]);
         }
         }
         for(int j=0;j<3;j++){
            if(j==0){
            Avelho=idade[j];
            Anovo=idade[j];
            Nvelho=nome[j];
            Nnovo=nome[j]; }
            
            else if (idade[j]<Anovo){
            Anovo=idade[j];
            Nnovo=nome[j];}
            
            else if (idade[j]>Avelho){
            Avelho=idade[j];
            Nvelho=nome[j]; }
            }
         System.out.println("Nome:"+Nnovo+"  Idade do aluno mais novo:"+Anovo+"\nNome:"+Nvelho+"  Idade do aluno mais velho:"+Avelho);  
         }   
   }
/*Uma turma possui 40 alunos. Faça um programa que leia o nome e a idade de todos os alunos e logo
em seguida imprima:
A. Total de alunos com idade menor ou igual a 16 anos
B. Total de alunos com idade maior que 16 anos
C. Média das idades
D. Alunos com idade acima da média
E. Nome e Idade do aluno mais novo
F. Nome e Idade do aluno mais velho*/ 
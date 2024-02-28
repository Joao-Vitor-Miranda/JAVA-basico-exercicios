import java.util.Scanner;
public class JoaoMiranda20{
   public static void main (String []args){
      Scanner ler = new Scanner(System.in);
      String n[]=new String[50];
      double s[]=new double[50],valor;
      int c[]= new int[50];
      int conta;
      boolean existe=false;
      
      for(int i=0;i<n.length;i++){
         System.out.println("|Cadastro|nome do usuário:");
         n[i]=ler.nextLine();
         System.out.println("|Cadastro|número da conta:");
         c[i]=ler.nextInt();
      
      do{
         System.out.println("número da conta:");
         conta=ler.nextInt();
         existe=false;
         for(int j=0;j<i;j++){
              if(conta==c[j]){
              existe=true;
              break;
              }
         }
         }while(existe==true);
         System.out.println("Saldo:");
         c[i]=conta;
         s[i]=ler.nextDouble();
         ler.nextLine();
         }
         int opcao;
         do{
         System.out.println("Menu de Operações\n1. Efetuar depósito\n2. Efetuar saque\n3. Consultar saldo em conta;\n4. Finalizar o programa");
         opcao=ler.nextInt();
               if(opcao==1){
               conta=ler.nextInt();
               existe=false;
                  for(int i=0;i<n.length;i++){
                     if(conta==c[i]){
                     existe=true;
                     valor=ler.nextDouble();
                     s[i]+=valor;
                     System.out.println(s[i]);
                     }
               }
               if(existe==false){
               System.out.println("conta inexistente");
               }}
               
               else if(opcao==2){
               conta=ler.nextInt();
               existe=false;
                  for(int i=0;i<n.length;i++){
                     if(conta==c[i]){
                     existe=true;
                     valor=ler.nextDouble();
                        if(valor<=s[i]){
                        s[i]=valor;
                        System.out.println(s[i]);
                        }
                        else
                        System.out.println("Saldo Insuficiente");
                        }
                        }
                        
                        if(existe==false){
               System.out.println("conta inexistente");
               }
               }
               else if(opcao==3){
               conta=ler.nextInt();
               existe=false;
                  for(int i=0;i<n.length;i++){
                     if(conta==c[i]){
                     existe=true;
                      System.out.println("saldo "+s[i]);}
                     }
                     if(existe==false){
                     System.out.println("conta inexistente");
                     }
               }
               else if(opcao!=4){
               System.out.println("opcao invalida");
               }
               }while(opcao!=4);
   }
}

/*Faça um programa que simule um controle bancário. O sistema bancário tem a capacidade de
armazenar as informações somente de 50 usuários e contém as opções de cadastrar usuário; efetuar
depósito; efetuar saque; consultar saldo em conta e finalizar o programa. O seguinte menu deverá
aparecer o seguinte menu na tela para o usuário: (Desafio: fazer com interface gráfica)

Menu de Operações
1. Efetuar depósito
2. Efetuar saque
3. Consultar saldo em conta;
4. Finalizar o programa

- Na opção de cadastrar usuário devem ser lidos os seguintes dados: nome do usuário (vetor de String
com 50 posições); número da conta (vetor inteiro de 50 posições); saldo da conta (vetor float com 50
posições). O número da conta devem ser armazenados em um vetor de números inteiros (não pode
haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de
números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta
504 foi armazenada na quinta posição do vetor de número de contas, seu saldo deverá ficar na quinta
posição do vetor de saldos.
- Para efetuar o depósito, deve-se solicitar o número da conta e o valor a ser depositado. Se a conta não
estiver cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu inicial. Se a
conta existir, atualizar e exibir o novo saldo;
- Para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver
cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu. Se a conta existir,
verificar se o seu saldo é suficiente para cobrir o saque. (Suponha que a conta não possa ficar com
saldo negativo). Se o saldo for suficiente, realizar o saque, exibir o novo saldo e voltar ao menu. Caso
contrário, mostrar a mensagem “Saldo insuficiente!” e voltar ao menu.
- Para consultar saldo em conta, deve-se solicitar o número da conta a ser pesquisada. Se a conta não
estiver cadastrada, deverá aparecer a mensagem “Conta não encontrada!”; senão, mostrar a conta com
seu respectivo saldo e voltar ao menu;
O programa termina quando for digitada a opção 4 – Finalizar o programa.*/
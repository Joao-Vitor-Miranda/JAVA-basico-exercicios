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
         System.out.println("|Cadastro|nome do usu�rio:");
         n[i]=ler.nextLine();
         System.out.println("|Cadastro|n�mero da conta:");
         c[i]=ler.nextInt();
      
      do{
         System.out.println("n�mero da conta:");
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
         System.out.println("Menu de Opera��es\n1. Efetuar dep�sito\n2. Efetuar saque\n3. Consultar saldo em conta;\n4. Finalizar o programa");
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

/*Fa�a um programa que simule um controle banc�rio. O sistema banc�rio tem a capacidade de
armazenar as informa��es somente de 50 usu�rios e cont�m as op��es de cadastrar usu�rio; efetuar
dep�sito; efetuar saque; consultar saldo em conta e finalizar o programa. O seguinte menu dever�
aparecer o seguinte menu na tela para o usu�rio: (Desafio: fazer com interface gr�fica)

Menu de Opera��es
1. Efetuar dep�sito
2. Efetuar saque
3. Consultar saldo em conta;
4. Finalizar o programa

- Na op��o de cadastrar usu�rio devem ser lidos os seguintes dados: nome do usu�rio (vetor de String
com 50 posi��es); n�mero da conta (vetor inteiro de 50 posi��es); saldo da conta (vetor float com 50
posi��es). O n�mero da conta devem ser armazenados em um vetor de n�meros inteiros (n�o pode
haver mais de uma conta com o mesmo c�digo) e os saldos devem ser armazenados em um vetor de
n�meros reais. O saldo dever� ser cadastrado na mesma posi��o do c�digo. Por exemplo, se a conta
504 foi armazenada na quinta posi��o do vetor de n�mero de contas, seu saldo dever� ficar na quinta
posi��o do vetor de saldos.
- Para efetuar o dep�sito, deve-se solicitar o n�mero da conta e o valor a ser depositado. Se a conta n�o
estiver cadastrada, dever� aparecer a mensagem �Conta n�o encontrada!� e voltar ao menu inicial. Se a
conta existir, atualizar e exibir o novo saldo;
- Para efetuar saque, deve-se solicitar o c�digo da conta e o valor a ser sacado. Se a conta n�o estiver
cadastrada, dever� aparecer a mensagem �Conta n�o encontrada!� e voltar ao menu. Se a conta existir,
verificar se o seu saldo � suficiente para cobrir o saque. (Suponha que a conta n�o possa ficar com
saldo negativo). Se o saldo for suficiente, realizar o saque, exibir o novo saldo e voltar ao menu. Caso
contr�rio, mostrar a mensagem �Saldo insuficiente!� e voltar ao menu.
- Para consultar saldo em conta, deve-se solicitar o n�mero da conta a ser pesquisada. Se a conta n�o
estiver cadastrada, dever� aparecer a mensagem �Conta n�o encontrada!�; sen�o, mostrar a conta com
seu respectivo saldo e voltar ao menu;
O programa termina quando for digitada a op��o 4 � Finalizar o programa.*/
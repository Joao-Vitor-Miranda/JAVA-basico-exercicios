import java.util.Scanner;
public class Joao24{
   public static void main (String []args){
   double n=1,kwh,t,p=0.3,pp=0.5,ppp=0.7,sm=0,i=0,pt=0,sm2=0,md;
   Scanner ler = new Scanner (System.in);
   while(n!=0){
   System.out.println("Digite o n�mero do consumidor:");
   n=ler.nextDouble();
      if(n==0)
      break;
   
      else{
      System.out.println("Digite o kwh consumido no mes:");
      kwh=ler.nextDouble();
      System.out.println("Digite o tipo do consumidor:");
      t=ler.nextDouble();
            if(t==1){
            pt=p*kwh;
            i++;
            sm+=kwh;
            sm2+=kwh;
            }
            else if(t==2){
            pt=pp*kwh;
            i++;
            sm+=kwh;
            sm2+=kwh;
            }
            else if(t==3){
            pt=ppp*kwh;
            sm2+=kwh;
            }
      }
      System.out.println("custo do consumidor:"+pt+"reais");
      }
      md=sm/i; 
      System.out.println("Total consumido pelos 3 tipos:"+sm2+"kwh\nMedia de cosumo do tipo 1 e 2:"+md+"kwh");
   }
 }
/*Uma Empresa de fornecimento de energia el�trica faz a leitura mensal dos medidores de consumo. Para
cada consumidor, s�o digitados os seguintes dados:
- N�mero do consumidor;
- Quantidade de kWh consumidos durante o m�s;
- Tipo (c�digo) do consumidor.
1 � residencial, pre�o em reais por kWh = 0,3
2 � comercial, pre�o em reais por kWh = 0,5
3 � industrial, pre�o em reais por kWh = 0,7

Os dados devem ser lidos at� que seja encontrado um consumidor com N�mero 0 (zero). Escreva um
programa que calcule e imprima:
- O custo total para cada consumidor;
- O total de consumo para os tr�s tipos de consumidor;
- A m�dia de consumo dos tipos 1 e 2.*/
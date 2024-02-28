import java.util.Scanner;
public class Joao16{
   public static void main (String []args){
   int bin, dec=0, octal=0,mult=1, res=0,aux, exp=0;
   
   String hex=" ";
    Scanner ler = new Scanner (System.in);
      System.out.print("Digite um numero: ");
      bin=ler.nextInt();
      boolean binario = true;
      while(bin>0){
         res  = bin%10;
         if(res!=0 && res!=1){
            binario = false;
            break;
         }
         bin /= 10;
         dec += (int)(res*Math.pow(2,exp));
         exp++;
      }
      
      if(binario==true){
      System.out.println("base decimal: "+dec);
      
      aux=dec;
      while(dec>0){
         res=dec%8;
         dec=dec/8;
         octal=octal+mult*res;
         mult=mult*10;
      }
       System.out.println("base octal: "+octal);
      while (aux>0){
         res=aux%16;
         aux=aux/16;
         
         switch(res){
            case 10: hex="A"+hex;
            break;
            
            case 11: hex="B"+hex;
            break;
            
            case 12: hex="C"+hex;
            break;
            
            case 13: hex="D"+hex;
            break;
            
            case 14: hex="E"+hex;
            break;
            
            case 15: hex="F"+hex;
            break;
            
            default: hex=res+hex;
            }
            System.out.println("base hexadecimal: "+hex);

           }
           }
           else{
           System.out.println("Não é binário: ");
           }
         }
      } 


/*Elabore um algoritmo que faça a conversão de um número binário digitado pelo usuário para o número na
base octal, base decimal e base hexadecimal. Valide se o valor informado na entrada só possui 0’s ou
1’s, ou seja, se é mesmo um número binário. Não utilize funções pré-definidas no JAVA.*/
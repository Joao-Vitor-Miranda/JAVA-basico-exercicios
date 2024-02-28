import java.util.Scanner;
public class JoaoMiranda17 {	
	public static void main(String[] args) {
   		int primos[] = new int[100];
   		int auxCont = 0, contaPrimos = 0;
   		for(int i = 1; i <= 100; i++)
          {
   			for (int j = 1; j <= (int)i/2; j++)
             {
   				if(i % j == 0) {
   					auxCont++;
   				}
   			}
   			if(auxCont == 1) {
   				primos[contaPrimos] = i;
   				contaPrimos++;
   			}
   			auxCont = 0;
   		}
   		
   		for(int i = 0; i < 100; i++)
         {
           if(primos[i] !=0)
           {
               System.out.println(primos[i]);
           }      
         }
         
         System.out.println("Sao ao total " + contaPrimos + " numeros primos");

 }
}


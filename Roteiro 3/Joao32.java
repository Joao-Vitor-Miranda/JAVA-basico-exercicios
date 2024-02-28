public class Joao32{
   public static void main (String []args){
   int cont=0,n=1,somaDiv,i;
   
      while(cont<5){
         somaDiv=0;
            for(i=1;i<=n/2;i++){
               if(n%i==0)
               somaDiv+=i;
            }
            if(somaDiv==n){
            System.out.println(n+" é perfeito");
            cont++;
            }
            n++;
      }
 }
}
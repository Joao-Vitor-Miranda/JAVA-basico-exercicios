public class Joao23{
   public static void main (String []args){
      
   int AbC=100,Bc,Ba,Ac,A,B,C,Total=3000,R;
   
   Bc=300-AbC;
   Ba=350-AbC;
   Ac=400-AbC;
   A=1450-Ac-Ba-AbC;
   B=1150-Ba-Bc-AbC;
   C=900-Bc-Ac-AbC;
   
   R=Total-AbC-Bc-Ba-Ac-A-B-C;
    
   
   System.out.print("O número de telespectadores que nenhuma das novelas os agradam é: "+R);
   
   } 
}
/*
toatl:3000
A 1450
B 1150
C 900
A e B 350
A e C 400
B e C 300
A, B e C 100
*/
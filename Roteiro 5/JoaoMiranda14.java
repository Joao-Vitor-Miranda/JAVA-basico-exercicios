import java.util.*;
public class JoaoMiranda14{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int vetA[][]=new int[4][12];
   int F,C;
   char op;
   for(int i=0;i<vetA.length;i++){
      for(int j=0;j<vetA[i].length;j++){
      vetA[i][j]=0;
      }
   }
   do{
   System.out.println("MARIA UNIDAS\na-Vender passagem\nb-Mostrar mapa de ocupação do ônibus\nc-Encerrar");
   op=ler.nextLine().charAt(0);
      if(op == 'a' || op== 'b' || op=='A' || op=='B'){
               if(op=='a' || op=='A'){
      
               int ok=0,k=0;
               for(int i=0;i<vetA.length;i++){
                  for(int j=0;j<vetA[i].length;j++){
                     if(vetA[i][j]==0)
                     ok++;
                  }
               }
               System.out.println(ok + " poltrona disponivel");
                  if(ok>0){
                     while(k!=1){
                     System.out.println("qual poltrona o mesmo deseja ocupar(Qual fileira(1 a 4))");
                     F=ler.nextInt();
                     F=F-1;
                     System.out.println("qual poltrona o mesmo deseja ocupar(Qual cadeira(1 a 12))");
                     C=ler.nextInt();
                     C=C-1;
                        if (vetA[F][C]==0){
                        System.out.println("Venda efetivada");
                        vetA[F][C]=1;
                        k=1;
                        }
                        else
                        System.out.println("Poltrona ocupada");
                     }
                     }
                     ler.nextLine();
         }
         else if(op=='b'||op=='B'){
         System.out.println("0=livre e 1=ocupada");
         for(int i=0; i<vetA.length; i++){
               for(int j=0; j<vetA[i].length; j++){
                     if((i==0 || i==3) && j==0)
                     System.out.print("Fileira(Janela):   "+(i+1)+" |Cadeira: "+(j+1)+" |-> "+vetA[i][j]);
                     
                     else if((i==1 || i==2) && j==0)
                     System.out.print("Fileira(Corredor): "+(i+1)+" |Cadeira: "+(j+1)+" |-> "+vetA[i][j]);
                     
                     else
                     System.out.print(" |Cadeira: "+(j+1)+" |-> "+vetA[i][j]);
               }
               System.out.println("");
            }
            System.out.println("aperte (ENTER) para volta ao menu");
            ler.nextLine();
         }
      }
   }
   while(op!='c');
}}
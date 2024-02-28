import java.util.*;
public class JoaoMiranda16{
   public static void main (String []args){
   Scanner ler = new Scanner (System.in);
   int vetA[][]=new int[5][10];
   int vetB[][]=new int[5][10];
   int vetC[][]=new int[5][10];
   String vetN[][]=new String [5][10];
   int op,cod,qa,ei,R=0;
   String nome;
    
   for(int i=0;i<vetA.length;i++){
      for(int j=0;j<vetA[i].length;j++){
      vetA[i][j]=-1;
      vetB[i][j]=-1;
      vetC[i][j]=-1;
      vetN[i][j]="z";
      }
   }
   do{
   System.out.println("==========================================\nFLORICULTURA MARIASFLOR\n==========================================\n1. CADASTRAR NOVA PLANTA\n2. RETIRAR PLANTA\n3. INSERIR PLANTA\n4. IMPRIMIR RELATÓRIO\n5. SAIR");
   op=ler.nextInt();
      if(op==1){
               int ok=0,k=0;          
               for(int i=0;i<vetA.length;i++){
                  for(int j=0;j<vetA[i].length;j++){
                     if(vetA[i][j]!=-1)
                     ok++;
                  }}
                  if(ok!=50){
                     while(k!=1){
                     ler.nextLine();
                     System.out.println("Nome:");
                     nome=ler.nextLine();
                     System.out.println("Código:");
                     cod=ler.nextInt();
                     System.out.println("quantidade atual");
                     qa=ler.nextInt();
                     System.out.println("estoque ideal");
                     ei=ler.nextInt();

                     for(int i=0;i<vetA.length;i++){
                        for(int j=0;j<vetA[i].length;j++){
                           if(vetA[i][j]==-1){
                           vetA[i][j]=cod;
                           vetB[i][j]=qa;
                           vetC[i][j]=ei;
                           vetN[i][j]=nome;
                           j=9;
                           i=4;
                           k=1;
                           }
                        }}
                     }
                     }}
                     
       else if(op==2){
       System.out.println("Digite o código da planta para retirar:");
       cod=ler.nextInt();
                for(int i=0;i<vetA.length;i++){
                   for(int j=0;j<vetA[i].length;j++){
                     if(cod==vetA[i][j]){   
                        System.out.println("Digite a quantidade para retirar:");
                        qa=ler.nextInt();
                           if(vetB[i][j]>qa)
                           vetB[i][j]-=qa;
                           else 
                           System.out.println("quantidade insuficiente");
                        }
                     }
                  }
       }
       else if(op==3){
       System.out.println("Digite o código da planta:");
       cod=ler.nextInt();
                for(int i=0;i<vetA.length;i++){
                   for(int j=0;j<vetA[i].length;j++){
                     if(cod==vetA[i][j]){   
                        System.out.println("Digite a quantidade comprada:");
                        qa=ler.nextInt();
                        vetB[i][j]+=qa;
                        }
                     }
                  }
       }
       else if(op==4){
       System.out.println("Relatório");
       for(int i=0;i<vetA.length;i++){
          for(int j=0;j<vetA[i].length;j++){
            if(vetA[i][j]!=-1){
              System.out.println("Nome da planta: "+vetN[i][j]+"  Codigo: "+ vetA[i][j]+ "  Quantidade Atual: "+vetB[i][j]);
              R=vetC[i][j]-vetB[i][j];
               if(R>0)
               System.out.println( "Quantidades a serem compradas: "+R);
            }
          
          }}
       }    
     }
   while(op!=5);
   System.out.println("FIM");
}}
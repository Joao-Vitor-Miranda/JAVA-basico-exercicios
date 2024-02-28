import java.util.Scanner;
public class Joao31{
   public static void main (String []args){
   int s1=0,s2=0,s3=0,s4=0,nulo=0,b=0,v ;
   Scanner ler = new Scanner (System.in);
   do
   {
   System.out.print("voto para os respectivos candidatos(1, 2, 3, 4)||voto em branco(5)||Outros valores: voto nulo||para finalizar(0)\nDigite o seu voto:");
   v=ler.nextInt();
   
   if(v!=0){
      if(v==1)
      s1++;
      
      else if(v==2)
      s2++;
      
      else if(v==3)
      s3++;
      
      else if(v==4)
      s4++;
      
      else if(v==5)
      b++;
      
      else
      nulo++;
   
   }
   }
   while (v!=0);   
   System.out.println("total de votos para cada candidato 1:"+s1+"\ntotal de votos para cada candidato 2:"+s2+"\ntotal de votos para cada candidato 3:"+s3+"\ntotal de votos para cada candidato 4:"+s4);
   System.out.println("total de votos nulos:"+nulo+"    total de votos em branco:"+b);
 }
}
/*Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os
dados utilizados para a contagem dos votos obedecem à seguinte codificação:
- 1, 2, 3, 4: voto para os respectivos candidatos;
- 5: voto em branco;
- Outros valores: voto nulo.
Elabore um algoritmo que leia o código do candidato em um voto. Calcule e escreva:
- total de votos para cada candidato;
- total de votos nulos;
- total de votos em branco;
Como finalizador do conjunto de votos, tem-se o valor de código igual à 0.*/
import java.util.Scanner;
public class Joao5{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   double Cc,Cf,Pd,Imp;
   System.out.println("Custo de f�brica do carro");
   Cf=ler.nextDouble();
   
      if (Cf<=28000){
      Pd=(Cf*0.05);
      Imp=0;
      }
      else if (Cf>28000 && Cf<=45000){
      Pd=(Cf*0.1);
      Imp=(Cf*0.15);
      }
      else {
      Pd=(Cf*0.15);
      Imp=(Cf*0.20);
      }
      
    Cc=Cf+Pd+Imp;
    
    System.out.println("O custo ao consumidor �:" + Cc);
   }
}

/*
O custo de um carro novo ao consumidor � a soma do custo de f�brica, a porcentagem do distribuidor e os
impostos. O valor pago pela distribui��o e dos impostos � calculado com base no custo de f�brica. As
porcentagens est�o apresentadas na tabela abaixo. Fa�a um programa que receba o custo de f�brica de um
carro e mostre o custo ao consumidor

Custo de F�brica                    % Distribuidor %Impostos
At� R$ 28000.00                                 5    Isento
Entre R$28000.01 e R$45000.00                  10    15
Acima de R$45000.00                            15    20*/
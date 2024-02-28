import java.util.Scanner;
public class Joao5{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   double Cc,Cf,Pd,Imp;
   System.out.println("Custo de fábrica do carro");
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
    
    System.out.println("O custo ao consumidor é:" + Cc);
   }
}

/*
O custo de um carro novo ao consumidor é a soma do custo de fábrica, a porcentagem do distribuidor e os
impostos. O valor pago pela distribuição e dos impostos é calculado com base no custo de fábrica. As
porcentagens estão apresentadas na tabela abaixo. Faça um programa que receba o custo de fábrica de um
carro e mostre o custo ao consumidor

Custo de Fábrica                    % Distribuidor %Impostos
Até R$ 28000.00                                 5    Isento
Entre R$28000.01 e R$45000.00                  10    15
Acima de R$45000.00                            15    20*/
import java.util.Scanner;
public class Joao10{
   public static void main(String []args){
   Scanner ler = new Scanner (System.in);
   
   int id;
   double kg,mg,R;
   System.out.println("Digite a idade:");
   id=ler.nextInt();
   System.out.println("Digite o peso:");
   kg=ler.nextDouble();
   
      if(id>=12){
         if(kg>=60){
         mg=1000;
         }
         else {
         mg=875;         }
      }
   
      else {
         if (kg>=5 && kg<=9){
         mg=125;
         }
         else if (kg>9 && kg<=16) {
         mg=250;
         }
         else if (kg>16 && kg<=24) {
         mg=375;
         }
         else if (kg>24 && kg<=30) {
         mg=500;
         }
         else  {
         mg=750;
         }
      }
      
    R=(20*mg)/500;  
    
    System.out.printf("Quantidade de gotas do medicamento que o paciente deve tomar:%.0f",R);
   }
}
/*Criar um algoritmo que a partir da idade e peso do paciente calcule a dosagem de determinado
medicamento e imprima a receita informando quantas gotas do medicamento o paciente deve tomar
por dose. Considere que o medicamento em questão possui 500 mg por ml, e que cada ml corresponde a 20
gotas.
- Adultos ou adolescentes desde 12 anos, inclusive, se tiverem peso igual ou acima de 60 quilos devem
tomar 1000 mg; com peso abaixo de 60 quilos devem tomar 875 mg.
- Para crianças e adolescentes abaixo de 12 anos a dosagem é calculada pelo peso corpóreo conforme a
tabela a seguir:*/
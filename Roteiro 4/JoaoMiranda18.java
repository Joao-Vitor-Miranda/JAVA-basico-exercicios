import java.util.Scanner;
public class JoaoMiranda18 {
		public static void main(String[] args) {
   		Scanner in = new Scanner(System.in);
   		double vetor[] = new double [20];
   		double soma = 0, avg;
   		double s = 0;
         double tamanhoLata;
         System.out.println("Qual o tamnho da lata? ");
         tamanhoLata = in.nextDouble();
         
   		
   		for(int i =0; i <vetor.length; i++)
         {
            vetor[i] = tamanhoLata; 
         }
         
         
         for(int i = 0; i < vetor.length; i++)
         {
   			soma += vetor[i];
   		}
   		
   		avg = soma / vetor.length;
   		
   		for(int i = 0; i < vetor.length; i++)
         {
   			s += ( ( Math.pow((vetor[i] - avg), 2) ) / (vetor.length - 1) );
   		}
   		s = Math.sqrt(s);
   		System.out.println("Desvio padrao e de: " + s);
   		
   		if(s != 5)
         {
   			System.out.println("O proceso deve ser revisado");
   		}
         else
         {
            System.out.println("O proceso nao precisa ser revisado");
         }
   	
   
  }	
}

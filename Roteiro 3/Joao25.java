public class Joao25{
   public static void main (String []args){
   double s=0,den=1,num=1,exp=3;
   
   for(int i=1;i<=51;i++){
      if(i%2==0)
      s=s-(num/Math.pow(den,exp));

      else
      s+=(num/Math.pow(den,exp));
      
      den+=2;  
   }
   s=Math.cbrt(s*32);
   System.out.printf("PI: %.4f",s);
 }
}
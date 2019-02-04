import java.util.Scanner;

class PrimeNumber
{  
   public static void main(String args[])
{
     int x,count=0;
     Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number");
    x= sc.nextInt();
for(int i=1;i<=x;i++)
{     
  if(x%i==0)
   {
     count++;
}
}
if(count==2){
   System.out.println(x+" is prime number");
}
else
{
   System.out.println(x+ " is not prime number");
}
}
}
   

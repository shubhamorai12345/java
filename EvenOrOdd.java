import java.util.Scanner;

class EvenOrOdd
{
   public static void main(String args[])
{
   int x;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number");
   x=sc.nextInt();
  if(x%2==0)
{    
   System.out.println("even");
}
  else
{
    System.out.println("odd");
}
}
}

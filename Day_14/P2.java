import java.util.*;
class P2
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter two number for Swapping:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Before Swapping:"+a + " "+b);
      int temp;
      temp=a;
      a=b;
      b=temp;
      System.out.print("After Swapping:" +a+ " "+b);
  }
}
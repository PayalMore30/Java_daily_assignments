import java.util.*;
class P3
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter length : ");
      int length=sc.nextInt();
      System.out.print("Enter breadth : ");
      int breadth=sc.nextInt();


      int area=length*breadth;
      System.out.print("Area of rectangle : "+area);
    }
}

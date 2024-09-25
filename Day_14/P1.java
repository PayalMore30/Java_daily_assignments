import java.util.*;
class P1
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter min number of series:");
      int a=sc.nextInt();
      System.out.print("Enter max number of series: ");
      int b=sc.nextInt();

       System.out.print("series of odd numbers Ranging between " +a +" and " +b +" is:");
      for(int i=a; i<=b; i++)
      {	 
         if(a%2==1)
	{
    	 
         System.out.print(a+ " ");
        }
        a++;
     }
	
  }
}
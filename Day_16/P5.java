import java.util.*;
class P5
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter 1st numbers: ");
      int a=sc.nextInt();
      System.out.print("Enter 2nd numbers: ");
      int b=sc.nextInt();
      System.out.print("Enter 3rd numbers: ");
      int c=sc.nextInt();

      System.out.print("The minimum number amongst "+a + "," +b +" & "+c + " is: ");

         if(a<=b && a<=c)
	{  	 
           System.out.print(" "+a);
        }
	else if(b<=c && b<=a)
	{  	 
           System.out.print(" "+b);
        }
        else{
      	  System.out.print(" "+c);
       }   
	
     }
}
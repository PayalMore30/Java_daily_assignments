import java.util.*;
class P2
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter two numbers: ");
      int a=sc.nextInt();
      int b=sc.nextInt();
        System.out.print("The minimum number amongst "+a + " & "+b + " is: ");

         if(a<b)
	{  	 
           System.out.print(" "+a);
        }
        else{
      	  System.out.print(" "+b);
       }   
	
     }
}
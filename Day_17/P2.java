import java.util.*;
class P2
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a numbers: ");
      int num=sc.nextInt();

	int predecessor;  
	predecessor=num-2;
	System.out.println("Second Predecessor : "+predecessor);

	
	int successor;  
	successor=num+2;
	System.out.println("Second Successor : "+successor);

   }
}
import java.util.*;
class P1
{
   public static void main(String [] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a numbers: ");
      int num=sc.nextInt();
      int sum=0;
      
	for(int i=1;i<num;i++)
        {   
           if(num%i==0)
	  {  	
		sum=sum+i;
	   }
         }
            if(sum==num)
	    {  	
              System.out.print("it is perfect number ");
             }
	    else 
	    {  	 
             System.out.print("it is not perfect number ");
           } 
	
     }
}
import java.util.*;
class P1{
   public static void main(String [] args){

    System.out.println("Enter number of elements:");
    Scanner sc = new Scanner(System.in);
    int element = sc.nextInt();
	int n1=0;
	int n2=1;
	int n3=0;
	System.out.println(n1);
	System.out.println(n2);
        for(int num=2;num<=element;num++)
	{
            n3=n1+n2;
	    System.out.print(n3+ " ");
	   n1=n2;
           n2=n3;

        }
   }
}
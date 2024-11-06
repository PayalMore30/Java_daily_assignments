import java.util.Scanner;
class P3 {
      public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num : ");
	num = sc.nextInt();
	for(int i=num; i>=0; i--)
	{
	  if(i % 2 ==0)
	   {
	      System.out.print(i+ " ");
	   }
	}
    }
}
import java.util.Scanner;
class P3 {
      public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num : ");
	num = sc.nextInt();
	int i=num;
	 while(i>=1)
	 {
	  if(i % 2 ==1)
	   {
	      System.out.print(i+ " ");	      
	   }
	   i--;

	}
    }
}
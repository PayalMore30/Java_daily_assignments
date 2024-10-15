import java.util.*;
class P2
{
  public static void main(String [] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter rupee:");
    float num = sc.nextFloat();
		if(num >= 0) {
			System.out.println("Dollar = " + num / 71.44);
		} else {
			System.out.println("Enter valild det.");
		}
  }
}
import java.util.*;
class P3{
   public static void main(String [] args){

    System.out.println("Enter number of elements:");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[10];
      for(int i=0;i<=arr.length;i++)
      {
	  arr[i]=sc.nextInt();
          if(arr[i]<=0)
	  {
	      break;
          }
     } 
  }
}
import java.util.*;
class P5{
   public static void main(String [] args){
     
    System.out.println("Enter intigers : ");
     Scanner sc = new Scanner(System.in);
     int arr[] = new int[5];

     for(int i=0 ; i<=arr.length; i++)
     {
        arr[i]=sc.nextInt();
        if(i > 0)
	{
	   if(arr[i - 1] > arr[i])
	   break;
	}
     }
  }
}
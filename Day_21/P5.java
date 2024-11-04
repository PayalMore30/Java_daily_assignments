import java.util.*;
class P5{
    public static void main(String [] args){
      Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of array");
	int size=sc.nextInt();
        int arr[]= new int[size];

	System.out.println("Enter elements of array");
 
	for(int i=0;i<arr.length;i++)
	{
 	  arr[i]=sc.nextInt();
	}

	int sum = 0;
        for (int i = 0; i < size; i++) 
	{
            sum = sum + arr[i];
        }

        System.out.println("sum of elements in array is : " + sum);
    }
}

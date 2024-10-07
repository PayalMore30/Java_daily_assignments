import java.util.*;

class P6 {
	public static void main(String[] args) {
	int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array ELements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

	System.out.print("Odd elements : ");
        for(int i=0; i<arr.length; i++)
       {
       if(arr[i]%2==1)
       {
	 System.out.print(arr[i]+" ");

	}
      }   
      System.out.println();
    
      System.out.print("Even elements : ");
 
      for(int i=0; i<arr.length; i++)
      {
        if(arr[i]%2==0)
         {
          System.out.print(arr[i]+ " ");
         }
     }
  }
}
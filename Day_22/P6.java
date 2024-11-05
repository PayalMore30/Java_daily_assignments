import java.util.Scanner;

 class P6 {
    public static void main(String[] args) {     
        int[] arr = {10,20,30,40,50};
	
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int num = sc.nextInt();
        
	boolean found=false;
	for (int element : arr) {
            if (element == num) {
                found = true;
                break;
            }
        }
	if(found)
	{
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

       
    }
}

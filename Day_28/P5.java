import java.util.*;
class P5{
   public static void main(String [] args){
     
    System.out.println("Enter num : ");
     Scanner sc = new Scanner(System.in);
     long num;
     int i = 0;
		
	num = sc.nextLong();
	while(num != 0) {
		if((num % 10) % 2 == 0)
				i++;
		num = num / 10;
	}
	System.out.println("No of even digits : " + i);
  }
}
import java.util.*;

class P3 {
     public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter hrs : ");
	int hrs = sc.nextInt();
	System.out.println(hrs >= 0 ? "sec : " + hrs * 60 * 60 : "Enter valid det.");
	}
}

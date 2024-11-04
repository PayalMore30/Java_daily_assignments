import java.util.Scanner;
class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in KM : ");
		float dist = sc.nextFloat();
		if(dist >= 0) {
			System.out.println("dist(m) : " + dist * 1000);
		} else {
			System.out.println("Enter valid number");
		}

	}
}

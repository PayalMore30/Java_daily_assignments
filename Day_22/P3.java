import java.util.Scanner;
class P3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in feet : ");
		double dist = sc.nextFloat();
		double centimeter;
		centimeter = dist * 30.48;
		System.out.println("Distance in centimeter : " + centimeter);
	}
}

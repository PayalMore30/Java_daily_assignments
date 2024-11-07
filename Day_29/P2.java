import java.util.Scanner;
class P2 {
	public static void main(String[] args) {
		String oct;
		String hex;
		System.out.println("Enter octal : ");
		Scanner sc = new Scanner(System.in);
		oct = sc.next();
		int dec = Integer.parseInt(oct, 8);
		System.out.println("Hex : " + Integer.toHexString(dec));
	}

}

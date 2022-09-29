import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int x = scan.nextInt();
		System.out.println("Enter your second number: ");
		int y = scan.nextInt();
		System.out.println("Enter your third number: ");
		int x2 = scan.nextInt();
		System.out.println("Enter your fourth number: ");
		int y2 = scan.nextInt();
		double d = Math.sqrt(Math.pow((x2-x), 2) + Math.pow((y2-y), 2));
		DecimalFormat d1 = new DecimalFormat("0.##");
		System.out.println("Distance is: " + d1.format(d));
		
	}

}

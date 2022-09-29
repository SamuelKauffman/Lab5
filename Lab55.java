import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of side A: ");
		int a = scan.nextInt();
		System.out.println("Enter the length of side B: ");
		int b = scan.nextInt();
		System.out.println("Enter the length of side C: ");
		int c = scan.nextInt();
		int s = (a + b + c) / 2;
		double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		DecimalFormat d = new DecimalFormat("0.##");
		System.out.println("Area of the triangle is: " + d.format(area));
		
	}

}

import java.text.NumberFormat;

public class OilPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		NumberFormat percent = NumberFormat.getPercentInstance();
		double num1 = 2.99;
		double num2 = .1;
		System.out.println("Oil price of Kentucky is: " + currency.format(num1));
		System.out.println("The oil price increased by " + percent.format(num2) + " last year.");
	}

}

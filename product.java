import java.util.*;

public class product {
	public static void main(String[] args){
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		System.out.println("Please enter the first number");

		int numInput1 = num1.nextInt();

		System.out.println("Please enter the second number");

		int numInput2 = num2.nextInt();

		System.out.println("The product of your numbers is: " +numInput1*numInput2);

	}
}
import java.util.*;

public class DivideNumbers {

	public static void main(String[] args){
		System.out.println("Please enter the first number");
		Scanner num1 = new Scanner(System.in);
		System.out.println("Please enter the second number");
		Scanner num2 = new Scanner(System.in);

		int firstNum = num1.nextInt();
		int secondNum = num2.nextInt();

		int result = firstNum + secondNum;

		System.out.println("The result of your division is: "+result);

	}


}
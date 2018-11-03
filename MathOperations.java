import java.util.*;

public class MathOperations{

	public static void main(String[] args){
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
	
		System.out.println("Please enter the first number");

		int input1 = num1.nextInt();

		System.out.println("Please enter the second number");

		int input2 = num2.nextInt();

		int sum = input1+input2;
		int prod = input1*input2;
		int diff = input1-input2;
		int quot = input1/input2;

		System.out.println(input1+" + "+input2+" = "+sum);
		System.out.println(input1+" x "+input2+" = "+prod);
		System.out.println(input1+" - "+input2+" = "+diff);
		System.out.println(input1+" / "+input2+" = "+quot);

	}


}
package assignment;

import java.util.Scanner;

public class product_of_three {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		
	int number1;
	int number2;
	int number3;
	System.out.println("enter 1st integer");
	number1=input.nextInt();
	System.out.println("enter 2nd integer");
	number2=input.nextInt();
	System.out.println("enter 3rd integer");
	number3=input.nextInt();
	System.out.printf("product of three numbers is %d:", number1*number2*number3);

	}

}

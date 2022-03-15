package assignment;
//Q5
import java.util.Scanner;

public class two_integers {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		int no1=0; int no2=0;
		System.out.printf("Number calculations\n");
		System.out.printf("Enter 1st number:\t");
		no1=input.nextInt();
		System.out.printf("Enter 2nd number:\t");
		no2=input.nextInt();
		System.out.printf("\n\n");
		System.out.printf("\tsum=\t\t%d\n",no1+no2);
		System.out.printf("\tdifference=\t%d\n",no1-no2);
		System.out.printf("\tproduct=\t%d\n",no1*no2);
		System.out.printf("\tdivison=\t%d\n",no1/no2);
		
	}

}

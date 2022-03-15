package assignment;

import java.util.Scanner;

//Q6
public class numbers_equal {

	private static Scanner in;

	public static void main(String[] args) {
		int x,y;
		in = new Scanner(System.in);
		System.out.println("Enter numbers for comparing");
		x=in.nextInt();
		y=in.nextInt();
		if(x>y)
		{
			System.out.println("A is larger\n");
		}
		else if(x<y)
		{
			System.out.println("B is larger\n");
		}
		else
		{
			System.out.println("bothe are equal");
		}
		
		

	}

}

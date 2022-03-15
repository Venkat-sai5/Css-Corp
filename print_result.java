package assignment;
//Q8
import java.util.Scanner;

public class print_result {

	private static Scanner in;

	public static void main(String[] args) {
		in = new Scanner(System.in);
		int a,b;
		a=in.nextInt();
		b=in.nextInt();
		if (b%a==0)
		{
			System.out.println("a is a multiple of b");
			
		}
		else
		{
			System.out.println("a is not a multiple of b");
		}
	}

}

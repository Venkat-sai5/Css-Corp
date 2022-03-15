package assignment;
//10
import java.util.Scanner;

public class volume_of_sphere {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("Enter the radius of sphere:");
		double radius=s.nextDouble();
		
		double volume=(4*22*radius*radius*radius)/(3*7);
		System.out.println("volume is"+volume);
	}

}

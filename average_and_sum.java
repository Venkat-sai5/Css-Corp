package assignment;
//12
import java.util.Scanner;
public class average_and_sum {

	private static Scanner input;
	public static double Average(int grades[], int max) {
		int sum=0;
		double average=0.0;
		for (int i=1;i<max;i++) {
			sum += grades[i];
			average=sum/(i);
		}
		return average;
	}
	public static void main(String[]args) {
		input = new Scanner(System.in);
		int i,  grades[];
		grades=new int[20];
		for (i=0; i<20;i++) {
			System.out.printf("enter grade of the studnet:\n");
			grades[i]=input.nextInt();
			if (grades[i]== -1)
				break;
		}
		System.out.printf("%.2f", Average(grades,i-1));
	}

}

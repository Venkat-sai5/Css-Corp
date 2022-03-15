package assignment;

import java.util.Scanner;

//Q7
public class three_integers {

	private static Scanner in;

	public static void main(String[] args) {
		int a,b,c,sum,product,average,smallest,largest;
		in = new Scanner(System.in);
		System.out.println("enter 3 numbers \n enterr number1:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		sum=a+b+c;
		average=(a+b+c)/3;
		product=a*b*c;
		if(a>b && a>c)
		{
			System.out.println("a is largest");
			
		}
		else if(b>a && b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
		if (a<b && a<c)
		{
			System.out.println("a is less");
			
		}
		else if (b<a && b<c)
		{
			System.out.println("b is small");
		}
		else
		{
			System.out.println("c is less");
		}
	}

}

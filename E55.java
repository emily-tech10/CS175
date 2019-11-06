package ch5homework;
import java.util.Scanner;
public class E55 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter three numbers : ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		if (n1 < n2 && n2 < n3)
			System.out.println("The three numbers you have entered are increasing");
		
		else if (n1 > n2 && n2 > n3)
			System.out.println("The three number you have entered are decreasing");
		
		else 
			System.out.println("The three numbers you have entered are neither increasing or decreasing");
		
	}

}

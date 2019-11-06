package ch5homework;
import java.util.Scanner;
public class E57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter three numbers and i will tell you if they are in order or not in order : ");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		if (n1<n2 && n2<n3)
			System.out.println("The three numbers you have entered are increasing and in order.");
		
		else if (n1<n2 && n2==n3)
			System.out.println("The three numbers you have entered are in order.");
		
		else if (n1>n2 && n2>n3)
			System.out.println("The three numbers you have entered are decreasing and in order.");
		
		else
			System.out.println("The three numbers you have entered are not in order");
		
			
		
		
		
		
		
		
		

	}

}

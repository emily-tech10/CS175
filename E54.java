package ch5homework;
import java.util.Scanner;
public class E54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter three digits and I will tell you if they are all the same, all different, or neither : ");
		
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		if(n1==n2 && n1==n3)
			System.out.println("The three numbers you have entered are all the same");
		
		else if (n1 != n2 && n1 != n3)
			System.out.println("The three numbers you have entered are all different");
		
		else
			System.out.println("The three numbers you have entered are neither all the same or all different.");
			
		
		

	}

}

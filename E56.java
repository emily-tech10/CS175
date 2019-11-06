package ch5homework;
import java.util.Scanner;
public class E56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter 3 numbers :  ");
		int n1  = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		
		System.out.println("What mode would you like this program to be in? (Lenient or Strict) " );
		String modePicked = in.next();
		
		if(modePicked.equals("Strict"))
			if (n1<n2 && n2<n3)
				System.out.println("The three numbers you entered are in increasing order. ");
			else if (n1> n2 && n2 > n3)
				System.out.println("The three numbers you entered are in decreasing order");
			else 
				System.out.println("The three numbers you entered  are not in order ");
		
		else if (modePicked.equals("Lenient"))
			if (n1 <= n2 && n2 <= n3)
				System.out.println("The three numbers you have entered are in increasing order");
			else if (n1 >= n2 && n2 >= n3)
				System.out.println("The three numbers you have entered are in decreasing order.");
			else if (n1 == n2 &&  n2 == n3)
				System.out.println("The three numbers you have entered are both in increasing and decreasing order");
			else 
				System.out.println("The numbers are not in order");		
}
}
import java.util.Scanner;
public class GroceryDiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		double discountOne = 0.08;
		double discountTwo = 0.10;
		double discountThree = 0.12;
		double discountFour = 0.14;
		double moneySpent;
		double totalMoney = 1; 
		
		Scanner in = new Scanner(System.in);
		boolean keepGoing = true;
		while (keepGoing = true) {
			
			
		
		System.out.println("Please enter the cost of groceries or 0 to quit");
		moneySpent = in.nextDouble();
		if (moneySpent == 0) {break;}
		
		if(moneySpent < 10) {
			
			System.out.println("You are not eligible for a coupon at this time.");
		}
			
		
		else if(moneySpent >= 10 && moneySpent < 60 ) {
			totalMoney = moneySpent * discountOne;
			System.out.println("You win a discount coupon of " + totalMoney);
			}
		
		else if(moneySpent >= 60 && moneySpent < 150) {
			totalMoney = moneySpent * discountTwo;
			System.out.println("You win a discount coupon of " + totalMoney);
		}
		
		else if(moneySpent >= 150 && moneySpent < 210) {
			totalMoney = moneySpent * discountThree; 
			System.out.println("You win a discount coupon of " + totalMoney);
		}
		
		else {
			totalMoney = moneySpent * discountFour;
			System.out.println("You win a discount coupon of "+ totalMoney);
		}
			
			
			
		
		
		
		
	
			
			
			
		
			

	
		
				
			
			
		
		

	}

}
}
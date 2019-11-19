import java.util.Arrays;
import java.util.Scanner;
public class BasicArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lowest = 0;
		String numbersString;
		double[] numb = {88,47,90,50,77,83,92,96,62,79};

		for (int x = 0; x < numb.length; x++) {
		    for (int y = x ; y < numb.length; y++) {
		        if (numb[x] > numb[y]) {
		            lowest = numb[x];
		            numb[x] = numb[y];
		            numb[y] = lowest;
		        }
		    }
		}
		
		numbersString = Arrays.toString(numb);

		System.out.println(numbersString);
		
		
		}

	}


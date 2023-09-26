
package conditional_statement;

import java.util.Scanner;

public class Possitive_or_Negative {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		
		if(num > 0)
		{
			System.out.println(num + " is Possitive");
		}
		
		else if(num < 0)
		{
			System.out.println(num + " is negative");
		}
		
		else 
		{
			System.out.println(num + " is neither negative nor possitive");
		}

	}

}

package conditional_statement;

import java.util.Scanner;

public class Greater_among_2_nos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number to check :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number to check :");
		int num2 = sc.nextInt();
		
		if(num1 > num2)
		{
			System.out.println(num1 + " is greater than " +num2);
		}
		
		else if(num1 < num2)
		{
			System.out.println(num2 + " is greater than " +num1);
		}
		
		else
		{
			System.out.println(num2 + " is equal to " +num1);
		}

	}

}
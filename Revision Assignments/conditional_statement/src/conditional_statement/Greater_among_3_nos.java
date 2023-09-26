
package conditional_statement;

import java.util.Scanner;

public class Greater_among_3_nos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number to check :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number to check :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the 3rd number to check :");
		int num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3 )
		{
			System.out.println(num1 + " is greater than " +num2 + " and " +num3);
		}
		
		else if(num2 < num1 && num2 > num3)
		{
			System.out.println(num2 + " is greater than " +num1 + " and " +num3);
		}
		
		else
		{
			System.out.println(num3 + " is greater than " +num1 + " and " +num2);
		}

	}

}
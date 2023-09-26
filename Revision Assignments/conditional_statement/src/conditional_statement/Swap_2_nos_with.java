package conditional_statement;

import java.util.Scanner;

public class Swap_2_nos_with {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number to check :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number to check :");
		int num2 = sc.nextInt();
		
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("a :" +num1);
		System.out.println("b :" +num2);

	}

}

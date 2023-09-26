package conditional_statement;

import java.util.Scanner;

public class Swappig_2_nos_without {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number to check :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number to check :");
		int num2 = sc.nextInt();
		
		 num1 = num1+num2;
		 num2 = num1-num2;
		 num1 = num1-num2;
		 
		System.out.println("a :" +num1);
		System.out.println("b :" +num2);

	}

}

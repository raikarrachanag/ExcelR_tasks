package conditional_statement;

import java.util.Scanner;

public class even_or_odd {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to check :");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num + "is even number");
		}
		
		else if(num%2!=0)
		{
			System.out.println(num + "is odd number");
		}
		
	}

}

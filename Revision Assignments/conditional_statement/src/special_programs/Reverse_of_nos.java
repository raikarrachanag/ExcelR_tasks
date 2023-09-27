package special_programs;

import java.util.Scanner;

public class Reverse_of_nos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp = n;
		int r, sum=0, rev=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			rev = rev * 10 + r;
		}
		
		System.out.println("The reverse of "+temp+" is : "+rev);

	}

}
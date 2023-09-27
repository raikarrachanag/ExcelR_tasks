package special_programs;

import java.util.Scanner;

public class Armstrong_nos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		int temp = n;
		int r, sum=0;
		
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;			
		}
		
		if(sum==temp)
		{
			System.out.println(temp+" is Armstrong number.");
		}
		
		else
		{
			System.out.println(temp+" is Not-Armstrong number.");
		}

	}

}
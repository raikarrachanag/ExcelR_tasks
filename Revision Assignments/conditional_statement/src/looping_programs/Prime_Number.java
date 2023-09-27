package looping_programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
	    boolean flag = false;
	    for (int i = 2; i <= num / 2; i++) {
	      
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (flag==true)
	    {
	      System.out.println(num + " is not a prime number.");
	    }
	    else if(num ==1)
	    {
	    	System.out.println(num + " is neither prime nor composite number.");
	    }
	    else
	    {
	      System.out.println(num + " is a prime number.");
	    }

	}

}
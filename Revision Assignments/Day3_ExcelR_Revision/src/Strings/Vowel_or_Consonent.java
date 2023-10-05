package Strings;

import java.util.Scanner;

public class Vowel_or_Consonent {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the character to search :");
		char ch = sc.next().charAt(0);
		
		if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println(ch+" is Vowel.");
		}

}
}
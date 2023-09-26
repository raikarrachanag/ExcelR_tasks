package switch_case;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		
		float PI =  3.142f;
		boolean flag = true;
		
		while(flag) {
		
			System.out.println("press 1 to find Area of circle");
			System.out.println("press 2 to find Area of rectangle");
			System.out.println("press 3 to find Area of triangle");
			System.out.println("press 4 to find Area of square");
			System.out.println("press 5 to find perimeter of circle");
			System.out.println("press 6 to find perimeter of rectangle");
			System.out.println("press 7 to find perimeter of triangle");
			System.out.println("press 8 to find perimeter of square");
			System.out.println("press 9 to Exit");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Select your option : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1 :
				
				System.out.println("Enter the radius :");
				int rad = sc.nextInt();
				
				float area = PI * rad * rad;
				
				System.out.println("Area of a circle is : \n"+area);
				break;
				
			case 2 :
				
				System.out.println("Enter the length :");
				int len = sc.nextInt();
				
				System.out.println("Enter the breadth :");
				int bre = sc.nextInt();
				
				double area2 = len * bre;
				
				System.out.println("Area of a Rectangle is : \n"+area2);
				break;
				
			case 3 :
				
				System.out.println("Enter the base :");
				int base = sc.nextInt();
				
				System.out.println("Enter the height :");
				int height = sc.nextInt();
				
				double area3 = 0.5 * (base * height);
				
				System.out.println("Area of a Triangle is : \n"+area3);
				break;
				
			case 4 :
				
				System.out.println("Enter the length :");
				int len1 = sc.nextInt();
				
				double area4 = len1 * len1;
				
				System.out.println("Area of a Square is : \n"+area4);
				break;
				
			case 5 :
				
				System.out.println("Enter the radius :");
				int rad1 = sc.nextInt();
				
				float per = 2 * PI * rad1;
				
				System.out.println("Perimeter of a circle is : \n"+per);
				break;
				
			case 6 :
				
				System.out.println("Enter the length :");
				int len2 = sc.nextInt();
				
				System.out.println("Enter the breadth :");
				int bre2 = sc.nextInt();
				
				double per2 = 2 * (len2 * bre2);
				
				System.out.println("Perimeter of a Rectangle is : \n"+per2);
				break;
				
			case 7 :
				
				System.out.println("Enter the Size 1 :");
				int a = sc.nextInt();
				
				System.out.println("Enter the Size 2 :");
				int b = sc.nextInt();
				
				System.out.println("Enter the Size 3 :");
				int c = sc.nextInt();
				
				double per3 = a + b + c;
				
				System.out.println("Perimeter of a Triangle is : \n"+per3);
				break;
				
			case 8 :
				
				System.out.println("Enter the length :");
				int len11 = sc.nextInt();
				
				double per4 = 4 * len11;
				
				System.out.println("Perimeter of a Square is : \n"+per4);
				break;
				
			case 9 :
				
				flag = false;
				return;

				
			}
			
		}
		
		System.out.println("Thank you for using..!!");

	}

}
package arrays;

public class Average_finding {

	public static void main(String[] args) {
		
		int marks[] = {91, 92, 93, 94, 95};
		
		int sum=0;
		
		for(int i=0; i<5; i++)
		{
			sum = sum + marks[i]; 
		}
		
		int avg = sum/marks.length;
		
		System.out.println("Sum is :"+sum);
		System.out.println("Average is :"+avg);

	}

}

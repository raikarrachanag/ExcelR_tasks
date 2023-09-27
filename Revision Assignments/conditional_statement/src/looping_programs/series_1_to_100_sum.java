package looping_programs;

public class series_1_to_100_sum {

	public static void main(String[] args) {
		
		int i;
		int sum = 0;
		
		for(i=1; i<=100; i++)
		{
			sum += i;
		}
		
		System.out.println("Sum is : " +sum);

	}

}
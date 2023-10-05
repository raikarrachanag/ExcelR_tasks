package array;

public class sum_of_pos_and_neg {

	public static void main(String[] args) {
		
		int evesum=0;
		int oddsum=0;
		int a[] = {1,-2,3,-4,5,-6};
		
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>0)
			{
				evesum+=a[i];
			}
			
			else
			{
				oddsum+=a[i];
			}
		}
		
		System.out.println("Even sum is : "+evesum);
		System.out.println("\nEven sum is : "+oddsum);

	}

}





















package programs1;

public class StrongNumber {

	     public static void main(String[] args) {
			
			int num=145,rem,sum=0;
			int strong;
			strong=num;
			
			
			while(num!=0)
			{
				rem = num%10;
				int fact = 1;
				for(int i=1;i<=rem;i++)
				{
					fact=fact*i;
				}
				
				num=num/10;
				sum=sum+fact;
			}
			System.out.println(sum);
			
			if(strong==sum)
			{
				System.out.println("It is a Strong Number");
			}
			else
			{
				System.out.println("It is not a Strong Number");
			}
			
	    	 
	    	 
	    	 
		}
}
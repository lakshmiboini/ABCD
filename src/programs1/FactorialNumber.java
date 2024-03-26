package programs1;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
	
	  int num=5;
	  int factorial=1,factorial1=0;
	  for(int i=1;i<=num;i++)
	  {
		  factorial=factorial*i;
		 factorial1=factorial1+i;
		 
	  } 
	  System.out.println("factorial of the Number "+num +" is "+factorial);
	  System.out.println("sum of the factorial1 of the Number "+num +" is "+factorial1);

	}
	
}

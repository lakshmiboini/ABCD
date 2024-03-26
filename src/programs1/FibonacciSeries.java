package programs1;

public class FibonacciSeries {

	public static void main(String[] args) {
		 
		int number1=0, number2=1, number3,i,count = 9;
		// print the 0 and 1 here
		
		System.out.println(number1+" is First Number and Second Number is "+number2 );
	// loop will start here form 2 because the number1 and number2 will print before statement
		
		for( i=0;i<count;++i) {
			number3= number1+number2;
			System.out.println(" "+number3);
			number1=number2;
			number2=number3;
			//System.out.println("FibonacciSeriesnumber "+number3);
		}
				}

}


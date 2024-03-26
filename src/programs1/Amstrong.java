package programs1;

public class Amstrong {

	public static void main(String[] args) {
		int sum=0,rem,temp;    
	    int number=371;    
	    temp=number;    
	    while(number>0)    
	    {    
	        rem=number%10; //Getting last digit  
	        number=number/10;  //Removing last digit from number  
	        sum=sum+(rem*rem*rem); //Calculating sum of cubes of digits    
	    }    
	    if(temp==sum)    
	        System.out.println(temp+" is an armstrong number");     
	    else    
	        System.out.println(temp+ " is not an armstrong number");     
	   }    
		
		
	}



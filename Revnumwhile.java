//Reverse a number using while loop and recursion
package executor;

public class Revnumwhile 
{

	public static void main(String[] args) 
	{
		int number = 123456789, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
		

	}



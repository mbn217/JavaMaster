package Section6;

public class Vid47 {

	public static int sumDigits(int number) {
		if (number<10) {
			return -1;
		}
		int sum=0;
		while (number>0) {
			// extract the ;est -significant digit
			int digit = number%10;
			sum+=digit;
			
			//drop the least significant digit
			number/=10; //same as number =number/10
			
		}
		return sum;
	}
	public static boolean isPalindrome(int number) {
		int r;
		int sum=0;
		int temp=number;
		  while(number!=0){    
			   r=number%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   number=number/10;    
			  }
		  if(temp==sum) {   
			   return true;   
		  }else  {  
			  return false;    
			}  
	}
	
	//challenge sum first and last digit number
	public static int sumFirstAndLastDigit(int number) {
		if (number<0) {
			return -1;
		}
        int ldig = number % 10;

        // keep looping num until it is in the range of 0-9
        while (number >= 10) {
            number = number / 10;
        }
        //initialize fdig variable and set it equal to num, just to make things clearer
        int fdig = number;
		return ldig+fdig;
	}
	
	public static void main(String[] args) {
		//challenge
		System.out.println("Sum of digits in number 125 is "+sumDigits(125));
		System.out.println("Sum of digits in number 125 is "+sumDigits(-125));
		System.out.println("Sum of digits in number 125 is "+sumDigits(1));
		System.out.println("Sum of digits in number 125 is "+sumDigits(12));
		//challenge for Palindrome number
		System.out.println(isPalindrome(-1221));
		System.out.println(isPalindrome(707));
		System.out.println(isPalindrome(11212));
		//challenge sum first and last digit number
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
		
	}
}
